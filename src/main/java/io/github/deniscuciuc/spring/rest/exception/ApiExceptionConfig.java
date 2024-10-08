package io.github.deniscuciuc.spring.rest.exception;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for the API exception library.
 *
 * <p>This class is used to enable component scanning for the library.
 *
 * @see ApiError
 * @see ApiException
 * @see ApiErrorResponse
 * @see ApiExceptionHandler
 * @author Denis Cuciuc
 * @since 0.0.1
 */
@Configuration
@ComponentScan("com.cuciuc.denis.libraries.java.spring.rest.api.exception")
public class ApiExceptionConfig {}
