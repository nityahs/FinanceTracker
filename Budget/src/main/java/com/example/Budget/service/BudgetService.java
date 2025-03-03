package com.example.Budget.service;



import com.example.Budget.entity.Budget;

import java.util.List;

public interface BudgetService {
    Budget createBudget(Budget budget);
    Budget updateBudget(Long id, Budget budget);
    void deleteBudget(Long id);
    Budget getBudget(Long id);
    List<Budget> getAllBudgets();
}