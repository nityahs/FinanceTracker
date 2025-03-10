package com.example.Budget.service;



import com.example.Budget.entity.Budget;

import com.example.Budget.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetServiceImpl implements BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    @Override
    public Budget createBudget(Budget budget) {

        return budgetRepository.save(budget);
    }

    @Override
    public Budget updateBudget(Long id, Budget updatedBudget) {
        Budget existingBudget = budgetRepository.findById(id).orElse(null); // Use orElse(null) to avoid exception

        if (existingBudget != null) {
            existingBudget.setCategory(updatedBudget.getCategory());
            existingBudget.setAmount(updatedBudget.getAmount());
            return budgetRepository.save(existingBudget);
        }
        return null; // Return null if not found
    }


    @Override
    public void deleteBudget(Long id) {

        budgetRepository.deleteById(id);
    }

    @Override
    public Budget getBudget(Long id) {

        return budgetRepository.findById(id).orElse(null);
    }

    @Override
    public List<Budget> getAllBudgets() {

        return budgetRepository.findAll();
    }
}