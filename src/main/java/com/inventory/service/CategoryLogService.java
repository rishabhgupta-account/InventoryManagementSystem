package com.inventory.service;

import com.inventory.entity.CategoryLogEntity;
import com.inventory.repository.CategoryLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class CategoryLogService {
    @Autowired
    private CategoryLogRepository categoryLogRepository;

    public void insert(CategoryLogEntity categoryLog) {
        categoryLogRepository.save(categoryLog);
    }


    public Optional<CategoryLogEntity> findById(int id) {
        return categoryLogRepository.findById(id);
    }

    public Iterable<CategoryLogEntity> findAll() {
        return categoryLogRepository.findAll();
    }

    public void updateCategoryLog(CategoryLogEntity categoryLog) {
        categoryLogRepository.save(categoryLog);
    }

    public void deleteCategoryLog(CategoryLogEntity categoryLog) {
        categoryLogRepository.delete(categoryLog);
    }




}
