package com.java.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.pojo.Currency;

public class CurrencyDAOImplementation extends BaseDAO implements CurrencyDAO {

	
	List<Currency> currencyList  = new ArrayList<Currency>();
	
	public CurrencyDAOImplementation() {
		
		/*Currency currency1 = new Currency(1,"INR","USD",5000);
		Currency currency2 = new Currency(2,"INR","EUR",6000);
		Currency currency3 = new Currency(3,"INR","UK",7000);
		Currency currency4 = new Currency(4,"INR","KWD",8000);
		Currency currency5 = new Currency(5,"INR","SGD",9000);
			
		currencyList.add(currency1);
		currencyList.add(currency2);
		currencyList.add(currency3);
		currencyList.add(currency4);
		currencyList.add(currency5);*/
		
		System.out.println("DAO : returning all currencies...");
		try {
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery("select * from currency");
			while(result.next()) {
				Currency currency = new Currency();
				currency.setCurrencyId(result.getInt(1));
				currency.setSourceCurrency(result.getString(2));
				currency.setTargetCurrency(result.getString(3));
				currency.setLoadFactor(result.getFloat(4));
				currencyList.add(currency);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<Currency> getAllCurrencies() {
	
		return currencyList;
	}
	
	public Currency getCurrency(int cid) {
		Currency foundCurrency = null;
		for (Currency currency : currencyList) {
			if(cid == currency.getCurrencyId()) {
				foundCurrency = currency;
				break;
			}
		}
	
		return foundCurrency;
	}

	public void insertCurrency(Currency curr) {
		try 
		{
			//conn.setAutoCommit(false);
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO CURRENCY VALUES (?,?,?,?)");
			pst.setInt(1, curr.getCurrencyId());
			pst.setString(2, curr.getSourceCurrency());
			pst.setString(3, curr.getTargetCurrency());
			pst.setFloat(4, curr.getLoadFactor());
			
			int rows = pst.executeUpdate();
			//conn.commit(); //changes are confirmed to the DB
			
			System.out.println("Record updated : "+rows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void updateCurrency(Currency curr) {
		
	}
	public void deleteCurrency(int id) {
		
	}

}
