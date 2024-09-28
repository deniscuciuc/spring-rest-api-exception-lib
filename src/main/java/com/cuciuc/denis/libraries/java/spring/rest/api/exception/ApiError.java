package com.cuciuc.denis.libraries.java.spring.rest.api.exception;

import org.springframework.http.HttpStatus;

/**
 * Enumeration of all possible API errors. Through this enumeration, all errors can be thrown using
 * exception() method. The exceptions will be handled by the {@link ApiExceptionHandler}.
 *
 * <p>Each error has a unique error code, a message and an HTTP status.
 *
 * <p>Usage Example:
 *
 * <pre>
 * throw ApiError.ENTITY_NOT_FOUND.exception();
 * </pre>
 *
 * @see ApiExceptionHandler, ApiException, ApiErrorResponse
 * @author Denis Cuciuc
 * @since 0.0.1
 */
public enum ApiError {

  /** An unknown error occurred. */
  UNKNOWN(0, "Unknown error", HttpStatus.INTERNAL_SERVER_ERROR),

  /** The requested entity was not found in the database. */
  ENTITY_NOT_FOUND(1, "Entity not found", HttpStatus.NOT_FOUND),

  /** The entity already exists in the database. */
  ENTITY_ALREADY_EXISTS(2, "Entity already exists", HttpStatus.CONFLICT),

  /** The API key is invalid. */
  IVALID_API_KEY(3, "Invalid API key", HttpStatus.UNAUTHORIZED);

  private final int errorCode;
  private final String errorMessage;
  private final HttpStatus httpStatus;

  ApiError(int errorCode, String errorMessage, HttpStatus httpStatus) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
    this.httpStatus = httpStatus;
  }

  /**
   * Gets the error code.
   *
   * @return the error code
   */
  public int getErrorCode() {
    return errorCode;
  }

  /**
   * Gets the error message.
   *
   * @return the error message
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Gets the HTTP status.
   *
   * @return the HTTP status
   */
  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  /**
   * Creates an API exception with this error.
   *
   * @return the API exception
   */
  public ApiException exception() {
    return new ApiException(this);
  }
}
