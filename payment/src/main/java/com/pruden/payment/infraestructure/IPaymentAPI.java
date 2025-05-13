package com.pruden.payment.infraestructure;


import com.pruden.payment.infraestructure.dto.CardDTO;
import com.pruden.payment.infraestructure.dto.ProcessDTO;
import org.springframework.http.ResponseEntity;

public interface IPaymentAPI {
    ResponseEntity<ProcessDTO> processPayment(CardDTO cardModel);
}
