package com.pruden.payment.infraestructure.dto;

public record CardDTO(
        String cvv,
        String titular,
        String cardNumber,
        String expirationDate,
        String ammount
) {
}
