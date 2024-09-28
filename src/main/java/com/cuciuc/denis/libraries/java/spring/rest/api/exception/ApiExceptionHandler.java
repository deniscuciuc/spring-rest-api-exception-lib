package com.cuciuc.denis.libraries.java.spring.rest.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Handles all exceptions thrown by the API.
 *
 * <p>The exceptions are handled by returning an error response containing the error code and
 * message.
 *
 * @see ApiError, ApiException, ApiErrorResponse
 * @author Denis Cuciuc
 * @since 0.0.1
 */
@RestControllerAdvice
public class ApiExceptionHandler {

  /**
   * Handles an API exception.
   *
   * @param e the exception
   * @return the error response
   */
  @ExceptionHandler(ApiException.class)
  public ResponseEntity<ApiErrorResponse> handleException(ApiException e) {
    HttpStatus status = e.getError().getHttpStatus();
    ApiErrorResponse response =
        new ApiErrorResponse(e.getError().getCode(), e.getError().getMessage(), e.getDescription());
    return ResponseEntity.status(status).body(response);
  }
}
