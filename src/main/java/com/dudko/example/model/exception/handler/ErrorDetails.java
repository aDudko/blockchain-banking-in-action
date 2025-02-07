package com.dudko.example.model.exception.handler;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Schema(description = "Model of response in case of an error")
@Data
@Builder
public class ErrorDetails {

    @Schema(description = "Error occurred date time")
    private LocalDateTime timestamp;

    @Schema(description = "Error message")
    private String message;

    @Schema(description = "Error details")
    private String details;

    @Schema(description = "Error code")
    private String errorCode;

}
