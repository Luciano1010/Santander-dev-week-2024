package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(unique = true)
    private String cardNumber;
    
    @Column(name= "available_limit" ,precision= 2, scale= 13)
    private BigDecimal  cardLimit;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public BigDecimal getCardLimit() {
        return cardLimit;
    }
    public void setCardLimit(BigDecimal cardLimit) {
        this.cardLimit = cardLimit;
    }
    
}
