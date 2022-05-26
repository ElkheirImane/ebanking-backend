package com.elkheir.ebankingbackend.services;

import com.elkheir.ebankingbackend.dtos.CustomerDTO;
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

    CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft , Long customerId) throws CustomerNotFoundException;
    SavingAccount saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccount getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId,double amount,String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId,double amount,String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource,String accountIdDestination,double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;


    List<BankAccount> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;
}
