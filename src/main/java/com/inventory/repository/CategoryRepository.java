package com.inventory.repository;

import com.inventory.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rishabh Gupta on 10/12/2020.
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {


}
