package com.dudko.example.domain.entity.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "account")
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String accountNumber;

    private String accountHolderName;

    @Enumerated(value = EnumType.STRING)
    private AccountType accountType;

    private double balance;

    @Enumerated(value = EnumType.STRING)
    private Currency currency;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @Enumerated(value = EnumType.STRING)
    private AccountStatus accountStatus;

}
