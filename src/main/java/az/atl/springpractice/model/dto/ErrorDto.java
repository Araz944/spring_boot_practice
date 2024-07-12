package az.atl.springpractice.model.dto;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class ErrorDto {
    int errorCode;
    String message;
    LocalDateTime localDateTime;
}
