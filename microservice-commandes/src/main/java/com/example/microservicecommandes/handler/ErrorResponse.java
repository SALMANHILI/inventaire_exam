package com.example.microservicecommandes.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}