package com.example.stockpricing.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StockPricing {

	@Id
	@GeneratedValue
	private Long id;

	private String symbol;
	private double bidPrice;
	private double askPrice;
	private double prevBidPrice;
	private double prevAskPrice;
	private char status;
	private Date stockDtCreate;
	private String stockUidCreate;
	private Date stockDtLupd;
	private String stockUidLupd;

	public StockPricing() {

	}

	public StockPricing(Long id, String symbol, double bidPrice, double askPrice, double prevBidPrice,
			double prevAskPrice, String trend, char status, Date stockDtCreate, String stockUidCreate, Date stockDtLupd,
			String stockUidLupd) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.bidPrice = bidPrice;
		this.askPrice = askPrice;
		this.prevBidPrice = prevBidPrice;
		this.prevAskPrice = prevAskPrice;
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

	public double getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}

	public double getAskPrice() {
		return askPrice;
	}

	public void setAskPrice(double askPrice) {
		this.askPrice = askPrice;
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

	public double getPrevBidPrice() {
		return prevBidPrice;
	}

	public void setPrevBidPrice(double prevBidPrice) {
		this.prevBidPrice = prevBidPrice;
	}

	public double getPrevAskPrice() {
		return prevAskPrice;
	}

	public void setPrevAskPrice(double prevAskPrice) {
		this.prevAskPrice = prevAskPrice;
	}

}
