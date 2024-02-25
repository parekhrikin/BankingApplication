package com.learning.bankingapplication.service;

import com.learning.bankingapplication.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    public Account createAccount(Account acc, int customerId);

    public List<Account> findAll();

    public Optional<Account> findById(Integer accountNo);

    public Account update(Optional<Account> a);

    public Optional<Account> delete(Integer accountNo);
}
