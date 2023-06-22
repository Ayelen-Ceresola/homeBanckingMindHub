package com.mindhub.homebanking.dtos;

import com.mindhub.homebanking.models.Card;
import com.mindhub.homebanking.models.CardColor;
import com.mindhub.homebanking.models.CardType;

import java.time.LocalDateTime;

public class CardDTO {
    private long id;

    private String cardHolder;
    private CardType type;
    private CardColor color;
    private String number;
    private  short cw;
    private LocalDateTime thruDate;
    private LocalDateTime fromDate;


    public CardDTO(Card card) {
        this.id = card.getId();
        this.cardHolder = card.getCardHolder();
        this.type = card.getType();
        this.color = card.getColor();
        this.number = card.getNumber();
        this.cw = card.getCw();
        this.thruDate = card.getThruDate();
        this.fromDate = card.getFromDate();
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public CardType getType() {
        return type;
    }

    public CardColor getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public short getCw() {
        return cw;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }
}
