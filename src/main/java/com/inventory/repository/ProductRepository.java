package com.inventory.repository;

import com.inventory.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rishabh Gupta on 3/23/2018.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
