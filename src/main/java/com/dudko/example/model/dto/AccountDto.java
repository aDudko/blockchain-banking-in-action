package com.dudko.example.model.dto;

import com.dudko.example.domain.entity.account.AccountStatus;
import com.dudko.example.domain.entity.account.AccountType;
import com.dudko.example.domain.entity.account.Currency;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Model of Account")
public record AccountDto(
        @Schema(description = "Account ID")
        Long id,

        @Schema(description = "Account number (CONTO)")
        String accountNumber,

        @Schema(description = "Account holder name")
        String accountHolderName,

        @Schema(description = "Associated with account types 'DEBIT' or 'CREDIT'")
        AccountType accountType,

        @Schema(description = "Account balance")
        double balance,

        @Schema(description = "Associated with account currencies like 'USD' or 'EUR' for example")
        Currency currency,

        @Schema(description = "Associated with account statuses 'ACTIVE', 'HOLD' or 'DELETED'")
        AccountStatus accountStatus) {}
