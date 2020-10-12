package com.inventory.service;

import com.inventory.entity.ProductLogEntity;
import com.inventory.repository.ProductLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class ProductLogService {
    @Autowired
    private ProductLogRepository productLogRepository;

    public void insert(ProductLogEntity pricingLog) {
        productLogRepository.save(pricingLog);
    }


    public Optional<ProductLogEntity> findById(int id) {
        return productLogRepository.findById(id);
    }

    public Iterable<ProductLogEntity> findAll() {
        return productLogRepository.findAll();
    }

    public void updateProductLog(ProductLogEntity productLog) {
        productLogRepository.save(productLog);
    }

    public void deleteProductLog(ProductLogEntity productLog) {
        productLogRepository.delete(productLog);
    }


}
