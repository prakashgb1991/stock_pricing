package com.example.stockpricing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.stockpricing.dto.StockPricingDto;

@Service
public interface StockService {
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<StockPricingDto> getStocks() throws Exception;

}
