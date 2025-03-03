package com.example.homepage.service;

import com.example.homepage.entity.FinEntity;
import java.util.List;
import java.util.Optional;

public interface FinService {
    FinEntity createTransaction(FinEntity transaction);
    List<FinEntity> getAllTransactions();
    Optional<FinEntity> getTransactionById(Integer id);
    FinEntity updateTransaction(Integer id, FinEntity updatedTransaction);
    void deleteTransaction(Integer id);
}
