package com.core.ajmg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Error {

    private Integer httpStatusCode;
    private String message;
    private LocalDateTime dateTime;

}
