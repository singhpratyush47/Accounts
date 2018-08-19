package com.accounts.repositories;

import com.accounts.entities.Account;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by PRATYUSH on 19-08-2018.
 */
public interface AccountRepository {
    List<Account> getAccounts();
    Account getAccount(Long id);
    int getNumberOfAccounts();
    Long createAccount(BigDecimal initialBalance);
    int deleteAccount(Long id);
    void updateAccount(Long id);
}
