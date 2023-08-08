package com.java.controller;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.java.pojo.Currency;
import com.java.service.CurrencyService;
import com.java.service.CurrencyServiceImplementation;
					//								web.xml
				//				         ProjectFolder   |   @Path value
				//							|			 |     |
@Path("/currencies") // http://localhost:8080/MyRestAPI2/rest/currency
public class CurrencyController {
	CurrencyService currencyService = new CurrencyServiceImplementation();
		
	@GET				//action mappings
	@Path("/greet") //http://localhost:8080/MyRestAPI2/rest/currency/greet
	public String welcome() {
		return "<h1> Welcome to Web Based Controller </h1>";
	}
	
	@GET  @Produces(MediaType.APPLICATION_JSON)
	public List<Currency> getAllCurrencies() {
		System.out.println("CONTROLLER : getAllCurrencies()....");
		return currencyService.getAllCurrenciesService();	
	}
	
	@GET @Path("/{cid}") @Produces(MediaType.APPLICATION_JSON)
	public Response getCurrency(@PathParam("cid") int x) {
		System.out.println("CONTROLLER : getCurrency(int)...."+x);
		try {
			Currency currObj = currencyService.getCurrency(x);
			
			return Response
		      .status(Response.Status.OK)
		      .entity(currObj)
		      .build();
		} catch (com.java.exceptions.CurrencyNotFoundException e) {
			return Response
		      .status(Response.Status.NOT_FOUND)
		      .entity(e.getMessage())
		      .build();
		}
	
	}
	
	
	@POST 
	@Path("/add") 
	public Response  addIt(Currency currObj) {	
		try {
			currencyService.addCurrencyService(currObj);
			
			return Response
		      .status(Response.Status.OK)
		      .entity("Currency Added")
		      .build();
			//return "currency added successfully";
		} catch (com.java.exceptions.CurrencyAlreadyExistsException e) {
			return Response
		      .status(Response.Status.NOT_FOUND)
		      .entity(e.getMessage())
		      .build();
			//return "currency already present";
		}
	}
	
}
