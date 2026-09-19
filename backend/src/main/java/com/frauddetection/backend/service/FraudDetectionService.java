package com.frauddetection.backend.service;

import com.frauddetection.backend.enums.Decision;
import com.frauddetection.backend.model.request.TransactionRequest;
import com.frauddetection.backend.model.response.TransactionDecisionResponse;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class FraudDetectionService {

    public TransactionDecisionResponse evaluateTransaction (TransactionRequest transactionRequest) {
        return TransactionDecisionResponse
                .builder()
                .transactionId(transactionRequest.getTransactionId())
                .ruleScore(null)
                .mlScore(null)
                .combinedScore(null)
                .ruleHits(List.of())
                .timestamp(Instant.now())
                .decision(Decision.ALLOW)
                .build();
    }
}
