package com.frauddetection.backend.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Setter
@Getter
public class CustomResponse {

    private String code;
    private String message;
    private Object body;
}
