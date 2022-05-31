package com.elkheir.ebankingbackend.dtos;

import com.elkheir.ebankingbackend.entities.AccountOperation;
import lombok.Data;

import java.util.List;
@Data
public class AccountHistoryDTO {

    private String accountId;
    private double balance;
    private int currentPage;
    private int totalPages;
    private int pageSize;
    private List<AccountOperationDTO> accountOperationDTOS;

}
