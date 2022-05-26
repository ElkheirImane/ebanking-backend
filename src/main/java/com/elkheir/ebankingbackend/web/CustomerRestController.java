package com.elkheir.ebankingbackend.web;

import com.elkheir.ebankingbackend.dtos.CustomerDTO;
import com.elkheir.ebankingbackend.exceptions.CustomerNotFoundException;
import com.elkheir.ebankingbackend.services.BankAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class CustomerRestController {
    private BankAccountService bankAccountService;
    @GetMapping("/customers")
    public List<CustomerDTO> customers(){
        return bankAccountService.listCustomers();
    }
        @GetMapping("/customers/{id}")

        public CustomerDTO getCustomer(@PathVariable(name ="id") Long customerId) throws CustomerNotFoundException {
            return bankAccountService.getCustomer(customerId);

    }
    @PostMapping("/customers")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        return bankAccountService.saveCustomer(customerDTO);

    }

}