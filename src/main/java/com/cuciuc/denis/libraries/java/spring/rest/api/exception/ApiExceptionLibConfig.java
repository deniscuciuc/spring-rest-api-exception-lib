package com.cuciuc.denis.libraries.java.spring.rest.api.exception;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for the API exception library.
 *
 * <p>This class is used to enable component scanning for the library.
 *
 * @see ApiError, ApiErrorResponse, ApiException, ApiExceptionHandler
 * @author Denis Cuciuc
 * @since 0.0.1
 */
@Configuration
@ComponentScan("com.cuciuc.denis.libraries.java.spring.rest.api.exception")
public class ApiExceptionLibConfig {}
