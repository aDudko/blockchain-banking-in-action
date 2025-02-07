package com.dudko.example.model.dto;

import com.dudko.example.domain.entity.transaction.TransactionType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(description = "Model of Transaction")
public record TransactionDto(
        @Schema(description = "Transaction ID")
        Long id,

        @Schema(description = "Account id from database")
        Long accountId,

        @Schema(description = "Transfer amount")
        double amount,

        @Schema(description = "Associated with transaction types 'DEPOSIT', 'WITHDRAWAL' or 'TRANSFER'")
        TransactionType tractionType,

        @Schema(description = "Transaction occurred date time")
        LocalDateTime timestamp) {}
