package com.hoversprite;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Response {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ErrorResponseDto {
        private String apiPath;

        private HttpStatus errorCode;

        private String errorMessage;

        private LocalDateTime errorTime;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ResponseDto {

        private String statusCode;

        private String statusMsg;

    }
}
