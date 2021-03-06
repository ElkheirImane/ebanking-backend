package com.elkheir.ebankingbackend.dtos;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
//@NoArgsConstructor @AllArgsConstructor
public class CustomerDTO {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
   // @OneToMany(mappedBy = "customer")
   // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   // private List<BankAccount> bankAccounts;

}
