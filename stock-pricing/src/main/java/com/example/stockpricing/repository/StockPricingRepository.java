package com.example.stockpricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stockpricing.model.StockPricing;

/**
 * @author Prakash
 *
 */
@Repository
public interface StockPricingRepository extends JpaRepository<StockPricing, Long>{
}
