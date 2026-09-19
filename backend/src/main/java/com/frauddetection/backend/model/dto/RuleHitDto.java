package com.frauddetection.backend.model.dto;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class RuleHitDto {

    private String ruleId;
    private Integer weight;
    private String reason;
}
