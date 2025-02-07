package com.dudko.example.domain.mapper;

import com.dudko.example.domain.entity.account.Account;
import com.dudko.example.model.dto.AccountDto;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {
        return Account.builder()
                .id(accountDto.id())
                .accountNumber(accountDto.accountNumber())
                .accountHolderName(accountDto.accountHolderName())
                .accountType(accountDto.accountType())
                .balance(accountDto.balance())
                .currency(accountDto.currency())
                .accountStatus(accountDto.accountStatus())
                .build();
    }

    public static AccountDto mapToAccountDto(Account account) {
        return new AccountDto(
                account.getId(),
                account.getAccountNumber(),
                account.getAccountHolderName(),
                account.getAccountType(),
                account.getBalance(),
                account.getCurrency(),
                account.getAccountStatus()
        );
    }

}
