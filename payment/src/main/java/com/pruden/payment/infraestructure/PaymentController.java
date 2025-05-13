package com.pruden.payment.infraestructure;

import com.pruden.payment.application.PaymentService;
import com.pruden.payment.infraestructure.dto.CardDTO;
import com.pruden.payment.infraestructure.dto.ProcessDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController implements IPaymentAPI{

    PaymentService paymentService;

    PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @Override
    public ResponseEntity<ProcessDTO> processPayment(CardDTO cardModel) {
        return null;
    }
}
