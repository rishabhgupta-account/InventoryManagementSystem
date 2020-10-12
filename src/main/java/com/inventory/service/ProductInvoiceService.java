package com.inventory.service;

import com.inventory.entity.ProductInvoice;
import com.inventory.repository.ProductInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class ProductInvoiceService {

@Autowired
    private ProductInvoiceRepository productInvoiceRepository;

    public void insert(ProductInvoice productInvoice) {
        productInvoiceRepository.save(productInvoice);
    }


    public Optional<ProductInvoice> findById(int id) {
        return productInvoiceRepository.findById(id);
    }

    public Iterable<ProductInvoice> findAll() {
        return productInvoiceRepository.findAll();
    }

    public void updateProductInvoice(ProductInvoice productInvoice) {
        productInvoiceRepository.save(productInvoice);
    }

    public void deleteProductInvoice(ProductInvoice productInvoice) {
        productInvoiceRepository.delete(productInvoice);
    }



}
