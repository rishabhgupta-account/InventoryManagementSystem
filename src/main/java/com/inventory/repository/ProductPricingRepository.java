package com.inventory.repository;

import com.inventory.entity.ProductPricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPricingRepository extends JpaRepository<ProductPricing,Integer>{
}
