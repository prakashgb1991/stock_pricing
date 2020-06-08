package com.example.stockpricing.dto;

import java.util.Date;

public class StockPricingDto {

	private Long id;

	private String symbol;
	private double price;
	private String trend;
	private boolean isDone;
	private char status;
	private Date stockDtCreate;
	private String stockUidCreate;
	private Date stockDtLupd;
	private String stockUidLupd;

	public StockPricingDto() {

	}

	public StockPricingDto(Long id, String symbol, double price, String trend, boolean isDone, char status,
			Date stockDtCreate, String stockUidCreate, Date stockDtLupd, String stockUidLupd) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.price = price;
		this.trend = trend;
		this.isDone = isDone;
		this.status = status;
		this.stockDtCreate = stockDtCreate;
		this.stockUidCreate = stockUidCreate;
		this.stockDtLupd = stockDtLupd;
		this.stockUidLupd = stockUidLupd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTrend() {
		return trend;
	}

	public void setTrend(String trend) {
		this.trend = trend;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Date getStockDtCreate() {
		return stockDtCreate;
	}

	public void setStockDtCreate(Date stockDtCreate) {
		this.stockDtCreate = stockDtCreate;
	}

	public String getStockUidCreate() {
		return stockUidCreate;
	}

	public void setStockUidCreate(String stockUidCreate) {
		this.stockUidCreate = stockUidCreate;
	}

	public Date getStockDtLupd() {
		return stockDtLupd;
	}

	public void setStockDtLupd(Date stockDtLupd) {
		this.stockDtLupd = stockDtLupd;
	}

	public String getStockUidLupd() {
		return stockUidLupd;
	}

	public void setStockUidLupd(String stockUidLupd) {
		this.stockUidLupd = stockUidLupd;
	}

}
