package com.cuciuc.denis.libraries.java.spring.rest.api.exception;

/**
 * Represents an exception that is thrown by the API.
 *
 * <p>The exception contains an error object.
 *
 * @see ApiError, ApiExceptionHandler, ApiErrorResponse
 * @author Denis Cuciuc
 * @since 0.0.1
 */
public class ApiException extends RuntimeException {
  private final ApiError error;

  public ApiException(ApiError error) {
    this.error = error;
  }

  public ApiError getError() {
    return error;
  }
}
