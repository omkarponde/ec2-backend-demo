package com.backend.tp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PingPongDTO {
    @JsonProperty("message")
    private String message;
}
