package com.dudko.example.domain.mapper;

import com.dudko.example.domain.entity.transaction.Transaction;
import com.dudko.example.model.dto.TransactionDto;

public class TransactionMapper {

    public static TransactionDto mapToTransactionDto(Transaction transaction) {
        return new TransactionDto(
                transaction.getId(),
                transaction.getAccountId(),
                transaction.getAmount(),
                transaction.getTractionType(),
                transaction.getTimestamp());
    }

}
