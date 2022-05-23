package com.elkheir.ebankingbackend.repsitories;

import com.elkheir.ebankingbackend.entities.AccountOperation;
import com.elkheir.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository <AccountOperation,Long>{
}
