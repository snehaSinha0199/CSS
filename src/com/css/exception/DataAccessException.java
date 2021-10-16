package com.css.exception;

public class DataAccessException extends RuntimeException {
public ErrorMessage exception;

public DataAccessException(ErrorMessage exception) {
	super();
	this.exception = exception;
}
public ErrorMessage getException() {
	return exception;
}
}
