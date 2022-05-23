package com.elkheir.ebankingbackend.repsitories;

import com.elkheir.ebankingbackend.entities.BankAccount;
import com.elkheir.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository <BankAccount,String>{
}
