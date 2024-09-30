package io.github.deniscuciuc.spring.rest.exception;

/**
 * Represents an exception that is thrown by the API.
 *
 * <p>The exception contains an error object.
 *
 * @see ApiError
 * @see ApiExceptionHandler
 * @see ApiErrorResponse
 * @see ApiExceptionConfig
 * @author Denis Cuciuc
 * @since 0.0.1
 */
public class ApiException extends RuntimeException {
  private final ApiError error;
  private String description;

  /**
   * Creates an exception with the specified error and description.
   *
   * @param error the error
   * @param description the description
   */
  public ApiException(ApiError error, String description) {
    this.error = error;
    this.description = description;
  }

  /**
   * Creates an exception with the specified error.
   *
   * @param error the error
   */
  public ApiException(ApiError error) {
    this.error = error;
  }

  /**
   * Gets the description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description.
   *
   * @param description the description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets the error.
   *
   * @return the error
   */
  public ApiError getError() {
    return error;
  }
}
