package com.inventory.service;

import com.inventory.entity.Stock;
import com.inventory.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public void insert(Stock stock) {
        stockRepository.save(stock);
    }

    public Optional<Stock> findById(int id) {
        return stockRepository.findById(id);
    }

    public Iterable<Stock> findAll() {
        return stockRepository.findAll();
    }

    public void updateStock(Stock stock) {
        stockRepository.save(stock);
    }

    public void deleteStock(Stock stock) {
        stockRepository.delete(stock);
    }


}
