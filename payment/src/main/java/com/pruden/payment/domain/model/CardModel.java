package com.pruden.payment.domain.model;


import com.pruden.payment.domain.vo.CardId;
import com.pruden.payment.domain.vo.Cvv;
import com.pruden.payment.domain.vo.NumberCard;
import com.pruden.payment.domain.vo.Titular;

public class CardModel {
    private CardId cardId;
    private Cvv cvv;
    private NumberCard numberCard;
    private Titular titular;
    private DateTime expirationDate;
}
