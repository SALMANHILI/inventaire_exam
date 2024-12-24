package com.example.microservicecommandes.kafka;

import org.example.ecommerce.customer.CustomerResponse;
import org.example.ecommerce.entity.PaymentMethod;
import org.example.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}