package me.dio.domain.model;

public class Account {
    private Long id;
    private String accountNumber;
    private String accountAgency;
    private double accountBalance;
    private double accountLimit;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountAgency() {
        return accountAgency;
    }
    public void setAccountAgency(String accountAgency) {
        this.accountAgency = accountAgency;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double getAccountLimit() {
        return accountLimit;
    }
    public void setAccountLimit(double accountLimit) {
        this.accountLimit = accountLimit;
    }

}
