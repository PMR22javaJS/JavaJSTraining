package com.java.service;

import java.util.List;

import com.java.dao.CurrencyDAO;
import com.java.dao.CurrencyDAOImplementation;
import com.java.exceptions.CurrencyAlreadyExistsException;
import com.java.exceptions.CurrencyNotFoundException;
import com.java.pojo.Currency;

public class CurrencyServiceImplementation implements CurrencyService {

	CurrencyDAO currencyDAO = new CurrencyDAOImplementation();
	
	@Override
	public List<Currency> getAllCurrenciesService() {
		
		System.out.println("SERVICE : getAllCurrenciesService()....");
		return currencyDAO.getAllCurrencies();
	}

	@Override
	public Currency getCurrency(int id) {
		System.out.println("SERVICE : getCurrency(int id)....");

		Currency currFound = null;
		
		currFound = currencyDAO.getCurrency(id);
	
		
		if(currFound == null ) {
			throw new CurrencyNotFoundException("The currency with id does not exists : "+id);
		}
		
		return currFound;
	}
	
	public void addCurrencyService(Currency currObj) throws CurrencyAlreadyExistsException
	{
		
		//LOGIC 
		Currency currFound = null;
		
		currFound = currencyDAO.getCurrency(currObj.getCurrencyId());
	
		
		if(currFound == null ) {
			currencyDAO.insertCurrency(currObj);
			System.out.println("currObj : "+currObj);
			System.out.println("currObj : "+currObj.getCurrencyId());
		}
		else {
			throw new CurrencyAlreadyExistsException("The currency with this id already exists : "+currObj.getCurrencyId());
		}
		
	}


}
