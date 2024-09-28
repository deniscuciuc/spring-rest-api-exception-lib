package com.cuciuc.denis.libraries.java.spring.rest.api.exception;

/**
 * Represents an error response that is returned by the API.
 *
 * <p>The response contains an error code, a message and a description.
 *
 * @see ApiError, ApiExceptionHandler, ApiException
 * @author Denis Cuciuc
 * @since 0.0.1
 */
public class ApiErrorResponse {
  private final int code;
  private String message;
  private String description;

  /**
   * Creates an error response with the specified code.
   *
   * @param code the error code
   */
  public ApiErrorResponse(int code) {
    this.code = code;
  }

  /**
   * Creates an error response with the specified code, message and description.
   *
   * @param code the error code
   * @param message the error message
   * @param description the error custom description
   */
  public ApiErrorResponse(int code, String message, String description) {
    this.code = code;
    this.message = message;
    this.description = description;
  }

  /**
   * Creates an error response with the specified code and message.
   *
   * @param code the error code
   * @param message the error message
   */
  public ApiErrorResponse(int code, String message) {
    this.code = code;
    this.message = message;
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
   * Sets the error message.
   *
   * @param message the error message
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Gets the error description.
   *
   * @return the error description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the error description.
   *
   * @param description the error description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets the error code.
   *
   * @return the error code
   */
  public int getCode() {
    return code;
  }
}
