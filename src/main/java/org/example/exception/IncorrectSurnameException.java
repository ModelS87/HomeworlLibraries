package org.example.exception;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class IncorrectSurnameException extends RuntimeException {
}
