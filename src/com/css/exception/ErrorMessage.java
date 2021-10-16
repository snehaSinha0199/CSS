package com.css.exception;

public class ErrorMessage {
public String message;
public int errorCode;
public String status;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public int getErrorCode() {
	return errorCode;
}
public void setErrorCode(int errorCode) {
	this.errorCode = errorCode;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
} 
}
