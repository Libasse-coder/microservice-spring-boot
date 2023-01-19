package com.esmt.m223isi.microservices.currencyconversionservice.bean;

import java.math.BigDecimal;

public class CurrencyConversion {

	private long id;
	private String from;
	private String to;
	private BigDecimal rateExchange;
	private BigDecimal amount;
	private BigDecimal calculateAmount;
	private String source;
	private String environment;
	
	public CurrencyConversion() {}

	public CurrencyConversion(long id, String from, String to, BigDecimal rateExchange, BigDecimal amount,
			BigDecimal calculateAmount, String source, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.rateExchange = rateExchange;
		this.amount = amount;
		this.calculateAmount = calculateAmount;
		this.source = source;
		this.environment = environment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getRateExchange() {
		return rateExchange;
	}

	public void setRateExchange(BigDecimal rateExchange) {
		this.rateExchange = rateExchange;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCalculateAmount() {
		return calculateAmount;
	}

	public void setCalculateAmount(BigDecimal calculateAmount) {
		this.calculateAmount = calculateAmount;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	
	
	
}
