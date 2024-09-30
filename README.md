# Spring Rest API Exception Library

## Overview

The ApiException library is designed to standardize error throwing and handling in REST API applications built with Java Spring. By providing a structured way to manage API errors, this library helps developers maintain consistency in error responses across their applications.

## Maven Dependency

To use this library in you project, add Maven dependency:

```xml
<dependency>
  <groupId>io.github.deniscuciuc</groupId>
  <artifactId>spring-rest-api-exception</artifactId>
  <version>{exception.lib.version}</version>
</dependency>
```

## Configuration

To start using this library, first you need to import the library configuration component:

```java
@Configuration
@Import(ApiExceptionConfig.class)
public class Config {

}
```

As alternative, you can scan base package of this library:

```java
@Configuration
@ComponentScan("io.github.deniscuciuc.spring.rest.exception")
public class Config {

}
```

## Usage
This library is very simple to use, just throw exception via already defined errors:

```java
throw ApiError.ENTITY_ALREADY_EXISTS.exception();
```

Or create your own custom errors holder class to throw all API errors via this class:

```java
public class CustomApiError extends ApiError {

  public static final CustomApiError CUSTOM_ERROR = new CustomApiError(1001, "Custom Error", HttpStatus.CONFLICT);

  CustomApiError(int code, String message, HttpStatus httpStatus) {
    super(code, message, httpStatus);
  }
}
```

Now you can throw custom and standard errors via custom error class:

```java
throw CustomApiError.CUSTOM_ERROR.exception();
```

## Core Components

1. **ApiError**: An enumeration of all possible API errors, each with a unique code, message, and HTTP status. You can throw exceptions using the `exception()` method, which will be handled by the `ApiExceptionHandler`.

2. **ApiException**: A custom exception class that wraps an `ApiError`. It allows you to include additional descriptions for each error.

3. **ApiErrorResponse**: Represents the structure of the error response returned by the API, containing the error code, message, and an optional description.

4. **ApiExceptionHandler**: A Spring `@RestControllerAdvice` that catches `ApiException` instances and returns a standardized error response to the client.

5. **ApiExceptionConfig**: A configuration class to enable component scanning for the library.
