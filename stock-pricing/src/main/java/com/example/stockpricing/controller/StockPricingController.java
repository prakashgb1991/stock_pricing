package com.example.stockpricing.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockpricing.dto.StockPricingDto;
import com.example.stockpricing.service.StockService;

@CrossOrigin(origins = "http://${url.active.ui}:8080")
@RestController
public class StockPricingController {

	@Autowired
	private StockService service;

	/**
	 * @return
	 */
	@RequestMapping("/stocks")
	public List<StockPricingDto> getAllTodos() {
		List<StockPricingDto> listStock = new ArrayList<StockPricingDto>();
		try {
			listStock = service.getStocks();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listStock;
	}

}
