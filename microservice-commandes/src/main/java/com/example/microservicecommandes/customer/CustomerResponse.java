package com.example.microservicecommandes.customer;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email
) {

}
