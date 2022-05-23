package com.elkheir.ebankingbackend.services;

import com.elkheir.ebankingbackend.entities.BankAccount;
import com.elkheir.ebankingbackend.entities.CurrentAccount;
import com.elkheir.ebankingbackend.entities.SavingAccount;
import com.elkheir.ebankingbackend.repsitories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankService   {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    public void consulter(){
        BankAccount bankAccount =
                bankAccountRepository.findById("08385891-4564-4f63-8ee2-adb4f8aff3dd").orElse(null);
        if (bankAccount != null) {
            System.out.println("******************");
            System.out.println(bankAccount.getId());
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.getStatus());
            System.out.println(bankAccount.getCreateDat());
            System.out.println(bankAccount.getCustomer().getName());
            System.out.println(bankAccount.getClass().getSimpleName());
            if (bankAccount instanceof CurrentAccount) {
                System.out.println("Over Draft=>" + ((CurrentAccount) bankAccount).getOverDraft());
            } else if (bankAccount instanceof SavingAccount) {
                System.out.println("Rate=>" + ((SavingAccount) bankAccount).getInterestRate());
            }
            bankAccount.getAccountOperations().forEach(op -> {

                System.out.println(op.getType() + "\t" + op.getAmount() + "\t" + op.getOperationDate());

            });
        }

    }
}
