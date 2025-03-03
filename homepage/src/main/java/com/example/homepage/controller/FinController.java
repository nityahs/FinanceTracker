package com.example.homepage.controller;

import com.example.homepage.entity.FinEntity;
import com.example.homepage.service.FinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transactions")
public class FinController {

    @Autowired
    private FinService service;

    //  Create a Transaction
    @PostMapping
    public ResponseEntity<FinEntity> createTransaction(@RequestBody FinEntity transaction) {
        return ResponseEntity.ok(service.createTransaction(transaction));
    }

    // Get All Transactions
    @GetMapping
    public ResponseEntity<List<FinEntity>> getAllTransactions() {
        return ResponseEntity.ok(service.getAllTransactions());
    }

    // Get Transaction by ID
    @GetMapping("/{id}")
    public ResponseEntity<Optional<FinEntity>> getTransactionById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getTransactionById(id));
    }

    // Update a Transaction
    @PutMapping("/{id}")
    public ResponseEntity<FinEntity> updateTransaction(@PathVariable Integer id, @RequestBody FinEntity updatedTransaction) {
        FinEntity updated = service.updateTransaction(id, updatedTransaction);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }

    // Delete a Transaction
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTransaction(@PathVariable Integer id) {
        service.deleteTransaction(id);
        return ResponseEntity.ok("Transaction deleted successfully.");
    }
}
