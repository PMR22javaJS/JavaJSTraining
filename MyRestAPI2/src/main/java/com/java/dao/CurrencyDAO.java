package com.java.dao;

import java.util.List;

import com.java.pojo.Currency;

public interface CurrencyDAO {

	//CRUD
	
	List<Currency> getAllCurrencies();
	Currency getCurrency(int cid);
	
	void insertCurrency(Currency curr);
	void updateCurrency(Currency curr);
	void deleteCurrency(int id);
	
	
}
