package com.frauddetection.backend.model.request;

import com.frauddetection.backend.enums.MerchantCategory;
import com.frauddetection.backend.validation.ValidCountryCode;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
@Setter
@Getter
public class TransactionRequest {
    @NotBlank(message = "TransactionID field cannot be empty")
    @Pattern(regexp = "^txn_\\d{5}$", message = "TransactionID must match txn_ followed by 5 digits")
    private String transactionId;

    @NotBlank(message = "CardID field cannot be empty")
    @Pattern(regexp = "^card_\\d{5}$", message = "CardID must match card_ followed by 5 digits")
    private String cardId;

    @Positive(message = "Amount must be greater than 0")
    @NotNull(message = "Amount field cannot be empty")
    private BigDecimal amount;

    @NotBlank(message = "Currency field cannot be empty")
    private String currency;

    @NotBlank(message = "MerchantID field cannot be empty")
    @Pattern(regexp = "^merch_\\d{5}$", message = "MerchantID must match merch_ followed by 5 digits")
    private String merchantId;

    @NotNull(message = "Merchant Category field cannot be empty")
    private MerchantCategory merchantCategory;

    @NotNull(message = "Timestamp field cannot be empty")
    private Instant timestamp;

    @ValidCountryCode
    @NotBlank(message = "Billing Country field cannot be empty")
    private String billingCountry;

    @ValidCountryCode
    @NotBlank(message = "Shipping Country field cannot be empty")
    private String shippingCountry;

    @Valid
    @NotNull(message = "Location field cannot be left empty")
    private Location location;

    @Setter
    @Getter
    public static class Location {
        @NotNull
        @DecimalMax(value = "90.0", message = "Latitude should be between -90.0 and 90.0")
        @DecimalMin(value = "-90.0", message = "Latitude should be between -90.0 and 90.0")
        private Double latitude;

        @NotNull
        @DecimalMax(value = "180.0", message = "Longitude should be between -180.0 and 180.0")
        @DecimalMin(value = "-180.0", message = "Longitude should be between -180.0 and 180.0")
        private Double longitude;
    }
}



