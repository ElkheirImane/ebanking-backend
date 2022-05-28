package com.elkheir.ebankingbackend.web;


import com.elkheir.ebankingbackend.dtos.AccountOperationDTO;
import com.elkheir.ebankingbackend.dtos.BankAccountDTO;
import com.elkheir.ebankingbackend.entities.BankAccount;
import com.elkheir.ebankingbackend.exceptions.BankAccountNotFoundException;
import com.elkheir.ebankingbackend.services.BankAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankAccountRestAPI {
    private BankAccountService bankAccountService;
    public BankAccountRestAPI(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }
   @GetMapping("/accounts/{accountId}")
    public BankAccountDTO getBankAccount(@PathVariable String accountId) throws BankAccountNotFoundException {
        return bankAccountService.getBankAccount(accountId);
        
    }
    @GetMapping("/accounts")
    public List<BankAccountDTO> listAccounts(){
        return bankAccountService.bankAccountList();
    }
    @GetMapping("/accounts/{accountId}/operations")
    public List<AccountOperationDTO> getHistory(@PathVariable String accountId){

    return  bankAccountService.accountHistory(accountId);

    }
}



