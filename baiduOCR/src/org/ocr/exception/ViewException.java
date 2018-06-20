package org.ocr.exception;

public class ViewException extends RuntimeException{

	public ViewException() {
		super();
	}
	
	public ViewException(String message) {
		super(message);
	}
	
	public ViewException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ViewException(Throwable cause) {
		super(cause);
	}
} 