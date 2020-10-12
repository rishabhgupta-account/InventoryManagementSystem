package com.inventory.repository;

import com.inventory.entity.StockLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockLogRepository extends JpaRepository<StockLogEntity,Integer>{
}
