package com.css.response;

public class Response {
public boolean success;
public String message;
public String data;

public boolean isSuccess() {
	return success;
}
public void setSuccess(boolean success) {
	this.success = success;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
}
