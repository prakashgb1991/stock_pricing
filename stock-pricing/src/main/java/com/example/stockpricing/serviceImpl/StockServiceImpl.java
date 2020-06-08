package com.example.stockpricing.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockpricing.dto.StockPricingDto;
import com.example.stockpricing.model.StockPricing;
import com.example.stockpricing.repository.StockPricingRepository;
import com.example.stockpricing.service.StockService;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockPricingRepository stockJpaRepository;

	/* (non-Javadoc)
	 * @see com.example.stockpricing.service.StockService#getStocks()
	 */
	@Override
	public List<StockPricingDto> getStocks() throws Exception  {
		List<StockPricing> stocks = stockJpaRepository.findAll();
		List<StockPricingDto> listStocks = new ArrayList<>();
		stocks.forEach(stock -> {
			try {
				listStocks.add(dtoFromEntity(stock));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return listStocks;

	}

	/**
	 * @param stock
	 * @return
	 * @throws Exception
	 */
	private StockPricingDto dtoFromEntity(StockPricing stock) throws Exception {
		if(null==stock) throw new Exception("stock entity is null");
		StockPricingDto dto = new StockPricingDto();
		double price = (stock.getAskPrice() + stock.getBidPrice()) / 2;
		dto.setPrice(price);
		dto.setSymbol(stock.getSymbol());
		double prevPrice= (stock.getPrevAskPrice()+stock.getPrevBidPrice())/2;
		if(price < prevPrice)
		dto.setTrend("Down");
		else
		dto.setTrend("up");	
		return dto;
	}

}
