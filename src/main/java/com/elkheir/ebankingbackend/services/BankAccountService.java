package com.elkheir.ebankingbackend.services;

import com.elkheir.ebankingbackend.dtos.*;
import com.elkheir.ebankingbackend.entities.BankAccount;
import com.elkheir.ebankingbackend.entities.CurrentAccount;
import com.elkheir.ebankingbackend.entities.Customer;
import com.elkheir.ebankingbackend.entities.SavingAccount;
import com.elkheir.ebankingbackend.exceptions.BalanceNotSufficientException;
import com.elkheir.ebankingbackend.exceptions.BankAccountNotFoundException;
import com.elkheir.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft , Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId,double amount,String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId,double amount,String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource,String accountIdDestination,double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;


    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;

    List<CustomerDTO> searchCustomers(String keyword);
    List<CustomerBankAccount> bankAccountByCustomer(Long id) throws BankAccountNotFoundException;
}
