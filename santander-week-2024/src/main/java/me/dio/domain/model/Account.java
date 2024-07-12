package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // unique deixando o numero da conta o usuario de forma exclusiva (unico)
    @Column(unique = true)
    private String Number;

    private String Agency;

    // precision deixando o saldo com 11 inteiros para 2 casas decimais
    @Column(precision= 2, scale= 13)
    private BigDecimal Balance;
    
    @Column(name= "adicional_limit" ,precision= 2, scale= 13)
    private BigDecimal Limit;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAccountNumber() {
        return Number;
    }
    public void setAccountNumber(String accountNumber) {
        this.Number = accountNumber;
    }
    public String getAccountAgency() {
        return Agency;
    }
    public void setAccountAgency(String accountAgency) {
        this.Agency = accountAgency;
    }
    public BigDecimal getAccountBalance() {
        return Balance;
    }
    public void setAccountBalance(BigDecimal accountBalance) {
        this.Balance = accountBalance;
    }
    public BigDecimal getAccountLimit() {
        return Limit;
    }
    public void setAccountLimit(BigDecimal accountLimit) {
        this.Limit = accountLimit;
    }

}
