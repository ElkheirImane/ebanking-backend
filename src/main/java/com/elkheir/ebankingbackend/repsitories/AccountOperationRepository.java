package com.elkheir.ebankingbackend.repsitories;

import com.elkheir.ebankingbackend.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository <AccountOperation,Long>{
   List<AccountOperation> findByBankAccount(String accountId);

    List<AccountOperation> findByBankAccountId(String accountId);
}

