package com.frauddetection.backend.controller;

import com.frauddetection.backend.model.request.TransactionRequest;
import com.frauddetection.backend.model.response.CustomResponse;
import com.frauddetection.backend.model.response.TransactionDecisionResponse;
import com.frauddetection.backend.service.FraudDetectionService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/transactions")
public class FraudDetectionController {
    private final FraudDetectionService fraudDetectionService;

    @PostMapping
    public ResponseEntity<CustomResponse> reviewTransaction (
            @RequestBody
            @Valid TransactionRequest transactionRequest) {
        return ResponseEntity.ok(
                new CustomResponse(
                        "00",
                        "Successful",
                        fraudDetectionService.evaluateTransaction(transactionRequest))
        );
    }


}
