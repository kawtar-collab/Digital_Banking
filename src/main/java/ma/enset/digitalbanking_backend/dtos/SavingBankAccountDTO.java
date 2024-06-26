package ma.enset.digitalbanking_backend.dtos;

import ma.enset.digitalbanking_backend.enums.AccountStatus;

import lombok.Data;

import java.util.Date;

@Data
public class SavingBankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
