package com.frauddetection.backend.model.response;

import com.frauddetection.backend.enums.Decision;
import com.frauddetection.backend.model.dto.RuleHitDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;
import java.util.List;

@Setter
@Getter
@Builder
public class TransactionDecisionResponse {

    private String transactionId;

    private Integer ruleScore;

    private Integer mlScore;

    private Double combinedScore;

    private Instant timestamp;

    private List<RuleHitDto> ruleHits;

    private Decision decision;



}
