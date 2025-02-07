package com.dudko.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import com.dudko.example.model.dto.AccountDto;
import com.dudko.example.model.dto.TransactionDto;
import com.dudko.example.model.dto.TransferFundDto;
import com.dudko.example.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Tag(name = "Account REST API")
@AllArgsConstructor
@RestController
@RequestMapping(value = "/account", produces = "application/vnd.api.v1+json")
public class AccountController {

    private final AccountService accountService;


    @Operation(
            summary = "Register new account",
            description = "To register new account and save in the database"
    )
    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto) {
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get account data",
            description = "To get account data by ID"
    )
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id) {
        return ResponseEntity.ok(accountService.getAccount(id));
    }

    @Operation(
            summary = "Get all accounts",
            description = "To get all accounts"
    )
    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

    @Operation(
            summary = "Deposit money",
            description = "To put money into the account"
    )
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
                                              @RequestBody Map<String, Double> request) {
        Double amount = request.get("amount");
        return ResponseEntity.ok(accountService.deposit(id, amount));
    }

    @Operation(
            summary = "Withdraw money",
            description = "To withdraw money from the account bu account ID"
    )
    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,
                                               @RequestBody Map<String, Double> request) {
        Double amount = request.get("amount");
        return ResponseEntity.ok(accountService.withdraw(id, amount));
    }

    @Operation(
            summary = "Activate the account",
            description = "To activate the account by account ID"
    )
    @PutMapping("/{id}/activate")
    public ResponseEntity<String> activateAccount(@PathVariable Long id) {
        accountService.activateAccount(id);
        return ResponseEntity.ok("Account is activate successfully");
    }

    @Operation(
            summary = "Hold the account",
            description = "To hold the account by account ID"
    )
    @PutMapping("/{id}/hold")
    public ResponseEntity<String> holdAccount(@PathVariable Long id) {
        accountService.holdAccount(id);
        return ResponseEntity.ok("Account is hold successfully");
    }

    @Operation(
            summary = "Delete the account",
            description = "To delete the account by account ID"
    )
    @PutMapping("/{id}/delete")
    public ResponseEntity<String> deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Account is deleted successfully");
    }

    @Operation(summary = "Transfer fund between two Accounts")
    @PostMapping("/transfer")
    public ResponseEntity<String> transferFund(@RequestBody TransferFundDto transferFundDto) {
        accountService.transferFunds(transferFundDto);
        return ResponseEntity.ok("Transfer Successful");
    }

    @Operation(summary = "Get all transactions of the account by account ID")
    @GetMapping("/{id}/transactions")
    public ResponseEntity<List<TransactionDto>> getTransactions(@PathVariable Long id) {
        return ResponseEntity.ok(accountService.getAccountTransactions(id));
    }

}
