package com.cuciuc.denis.libraries.java.spring.rest.api.exception;

public class ApiErrorResponse {
  private final int code;
  private String message;
  private String description;

  public ApiErrorResponse(int code) {
    this.code = code;
  }

  public ApiErrorResponse(int code, String message, String description) {
    this.code = code;
    this.message = message;
    this.description = description;
  }

  public ApiErrorResponse(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getCode() {
    return code;
  }
}
