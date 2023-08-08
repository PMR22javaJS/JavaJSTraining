package com.java.service;

import java.util.List;

import com.java.exceptions.CurrencyAlreadyExistsException;
import com.java.pojo.Currency;

public interface CurrencyService {

	List<Currency> getAllCurrenciesService() ;
	Currency getCurrency(int id) ;
	
	void addCurrencyService(Currency curr) throws CurrencyAlreadyExistsException;
	

	
}
