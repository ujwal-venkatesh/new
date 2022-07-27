package com.techtree.employee.response;

import java.util.Optional;




public class ResponseStructure<T> {
private String message;
private T data;
private Optional<T> Opdata;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public T getData() {
	return data;
}
public void setData(T data) {
	this.data = data;
}
public Optional<T> getOpdata() {
	return Opdata;
}
public void setOpdata(Optional<T> opdata) {
	Opdata = opdata;
}


}
