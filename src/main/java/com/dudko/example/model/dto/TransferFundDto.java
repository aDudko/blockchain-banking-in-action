package com.dudko.example.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Model of TransferFund")
public record TransferFundDto(
        @Schema(description = "Account ID from which money is transferred")
        Long fromAccountId,

        @Schema(description = "Account ID to which money is transferred")
        Long toAccountId,

        @Schema(description = "Transfer amount")
        double amount) {}
