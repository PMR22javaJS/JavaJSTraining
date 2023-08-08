package com.java.pojo;

public class Currency {
	private int currencyId;
	private String sourceCurrency;
	private String targetCurrency;
	private float loadFactor;
	
	private double amountToConvert;
		
	public Currency() {
		super();
		System.out.println("Currency() ctor....");
	}
	
	
	public float getLoadFactor() {
		return loadFactor;
	}


	public void setLoadFactor(float loadFactor) {
		this.loadFactor = loadFactor;
	}


	public Currency(int cid, String sourceCurrency, String targetCurrency, double amountToConvert) {
		super();
		this.currencyId = cid;
		this.sourceCurrency = sourceCurrency;
		this.targetCurrency = targetCurrency;
		this.amountToConvert = amountToConvert;
	}


	public int getCurrencyId() {
		return currencyId;
	}


	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}


	public String getSourceCurrency() {
		return sourceCurrency;
	}
	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}
	public String getTargetCurrency() {
		return targetCurrency;
	}
	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}
	public double getAmountToConvert() {
		return amountToConvert;
	}
	public void setAmountToConvert(double amountToConvert) {
		this.amountToConvert = amountToConvert;
	}


	@Override
	public String toString() {
		return "Currency [currencyId=" + currencyId + ", sourceCurrency=" + sourceCurrency + ", targetCurrency="
				+ targetCurrency + ", loadFactor=" + loadFactor + ", amountToConvert=" + amountToConvert + "]";
	}
	
	
}
