package com.example.Budget.controller;


import com.example.Budget.entity.Budget;
import com.example.Budget.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budgets")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @PostMapping("/createBudget")
    public Budget createBudget(@RequestBody Budget budget) {

        return budgetService.createBudget(budget);
    }

    @PutMapping("updateBudget/{id}")
    public Budget updateBudget(@PathVariable (name = "id") Long id, @RequestBody Budget budget) {
        return budgetService.updateBudget(id, budget);
    }

    @DeleteMapping("deleteBudget/{id}")
    public void deleteBudget(@PathVariable (name = "id") Long id) {

        budgetService.deleteBudget(id);
    }

    @GetMapping("getBudget/{id}")
    public Budget getBudget(@PathVariable Long id) {

        return budgetService.getBudget(id);
    }


    @GetMapping("/showallBudgets")
    public List<Budget> getAllBudgets() {

        return budgetService.getAllBudgets();
    }
}