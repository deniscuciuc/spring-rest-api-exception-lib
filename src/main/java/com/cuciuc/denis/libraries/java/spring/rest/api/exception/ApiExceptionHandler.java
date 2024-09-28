package com.cuciuc.denis.libraries.java.spring.rest.api.exception;

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
    return ResponseEntity.status(e.getError().getHttpStatus())
        .body(new ApiErrorResponse(e.getError().getErrorCode(), e.getError().getErrorMessage()));
  }
}
