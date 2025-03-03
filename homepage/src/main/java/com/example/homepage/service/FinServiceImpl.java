package com.example.homepage.service;

import com.example.homepage.entity.FinEntity;
import com.example.homepage.repository.FinRepo;
import com.example.homepage.service.FinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinServiceImpl implements FinService {

    @Autowired
    private FinRepo repository;

    @Override
    public FinEntity createTransaction(FinEntity transaction) {
        return repository.save(transaction);
    }

    @Override
    public List<FinEntity> getAllTransactions() {
        return repository.findAll();
    }

    @Override
    public Optional<FinEntity> getTransactionById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public FinEntity updateTransaction(Integer id, FinEntity updatedTransaction) {
        return repository.findById(id).map(transaction -> {
            transaction.setUserId(updatedTransaction.getUserId());
            transaction.setCurrency(updatedTransaction.getCurrency());
            transaction.setTransactionDate(updatedTransaction.getTransactionDate());
            transaction.setTranAmt(updatedTransaction.getTranAmt());
            transaction.setTranstype(updatedTransaction.getTranstype());
            transaction.setLabel(updatedTransaction.getLabel());
            return repository.save(transaction);
        }).orElse(null);
    }

    @Override
    public void deleteTransaction(Integer id) {
        repository.deleteById(id);
    }
}
