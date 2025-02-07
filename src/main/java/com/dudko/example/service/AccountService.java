package com.dudko.example.service;

import com.dudko.example.model.dto.AccountDto;
import com.dudko.example.model.dto.TransactionDto;
import com.dudko.example.model.dto.TransferFundDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccount(Long id);

    List<AccountDto> getAllAccounts();

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    void holdAccount(Long id);

    void deleteAccount(Long id);

    void activateAccount(Long id);

    void transferFunds(TransferFundDto transferFundDto);

    List<TransactionDto> getAccountTransactions(Long id);

}
