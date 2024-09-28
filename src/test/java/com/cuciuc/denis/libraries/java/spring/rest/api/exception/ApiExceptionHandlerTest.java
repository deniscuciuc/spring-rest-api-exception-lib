package com.cuciuc.denis.libraries.java.spring.rest.api.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

/**
 * Tests for the {@link ApiExceptionHandler}.
 *
 * @author Denis Cuciuc
 * @since 0.0.1
 */
class ApiExceptionHandlerTest {

  /** Tests the {@link ApiExceptionHandler#handleException(ApiException)} method. */
  @Test
  void testHandleException() {
    ApiExceptionHandler apiExceptionHandler = new ApiExceptionHandler();
    ApiException apiException = new ApiException(ApiError.UNKNOWN);
    ResponseEntity<ApiErrorResponse> response = apiExceptionHandler.handleException(apiException);
    assertEquals(500, response.getStatusCode().value());
    assertEquals(0, response.getBody().getCode());
    assertEquals("Unknown error", response.getBody().getMessage());
    assertNull(response.getBody().getDescription());
  }

  /**
   * Tests the {@link ApiExceptionHandler#handleException(ApiException)} method with a description.
   */
  @Test
  void testHandleExceptionWithDescription() {
    ApiExceptionHandler apiExceptionHandler = new ApiExceptionHandler();
    ApiException apiException = new ApiException(ApiError.ENTITY_ALREADY_EXISTS, "Description");
    ResponseEntity<ApiErrorResponse> response = apiExceptionHandler.handleException(apiException);
    assertEquals(409, response.getStatusCode().value());
    assertEquals(2, response.getBody().getCode());
    assertEquals("Entity already exists", response.getBody().getMessage());
    assertEquals("Description", response.getBody().getDescription());
  }
}
