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
public class ApiError {

  public static final ApiError UNKNOWN =
      new ApiError(0, "Unknown error", HttpStatus.INTERNAL_SERVER_ERROR);

  public static final ApiError ENTITY_NOT_FOUND =
      new ApiError(1, "Entity not found", HttpStatus.NOT_FOUND);

  public static final ApiError ENTITY_ALREADY_EXISTS =
      new ApiError(2, "Entity already exists", HttpStatus.CONFLICT);

  public static final ApiError IVALID_API_KEY =
      new ApiError(3, "Invalid API key", HttpStatus.UNAUTHORIZED);

  public static final ApiError BAD_REQUEST = new ApiError(4, "Bad request", HttpStatus.BAD_REQUEST);

  public static final ApiError UNAUTHORIZED =
      new ApiError(5, "Unauthorized access", HttpStatus.UNAUTHORIZED);

  public static final ApiError FORBIDDEN =
      new ApiError(6, "Forbidden access", HttpStatus.FORBIDDEN);

  public static final ApiError METHOD_NOT_ALLOWED =
      new ApiError(7, "Method not allowed", HttpStatus.METHOD_NOT_ALLOWED);

  public static final ApiError UNSUPPORTED_MEDIA_TYPE =
      new ApiError(8, "Unsupported media type", HttpStatus.UNSUPPORTED_MEDIA_TYPE);

  public static final ApiError UNPROCESSABLE_ENTITY =
      new ApiError(9, "Unprocessable entity", HttpStatus.UNPROCESSABLE_ENTITY);

  public static final ApiError TOO_MANY_REQUESTS =
      new ApiError(10, "Too many requests", HttpStatus.TOO_MANY_REQUESTS);

  public static final ApiError INTERNAL_SERVER_ERROR =
      new ApiError(11, "Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);

  public static final ApiError SERVICE_UNAVAILABLE =
      new ApiError(12, "Service unavailable", HttpStatus.SERVICE_UNAVAILABLE);

  private final int code;
  private final String message;
  private final HttpStatus httpStatus;

  ApiError(int code, String message, HttpStatus httpStatus) {
    this.code = code;
    this.message = message;
    this.httpStatus = httpStatus;
  }

  /**
   * Gets the error code.
   *
   * @return the error code
   */
  public int getCode() {
    return code;
  }

  /**
   * Gets the error message.
   *
   * @return the error message
   */
  public String getMessage() {
    return message;
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

  /**
   * Creates an API exception with this error and a custom description.
   *
   * @param message the custom message
   * @return the API exception
   */
  public ApiException exception(String description) {
    return new ApiException(this, description);
  }
}
