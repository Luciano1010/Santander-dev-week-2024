package me.dio.domain.model;

public class Card {
    private Long id;
    private String cardNumber;
    private double  cardLimit;
    
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
    public double getCardLimit() {
        return cardLimit;
    }
    public void setCardLimit(double cardLimit) {
        this.cardLimit = cardLimit;
    }
    
}
