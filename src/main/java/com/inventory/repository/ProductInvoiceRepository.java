package com.inventory.repository;

import com.inventory.entity.ProductInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInvoiceRepository extends JpaRepository<ProductInvoice,Integer>{
}
