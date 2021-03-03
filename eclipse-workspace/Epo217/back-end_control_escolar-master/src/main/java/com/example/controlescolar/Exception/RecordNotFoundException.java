package com.example.controlescolar.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFoundException  extends RuntimeException{
		
	public RecordNotFoundException(String excepcion) {
			super(excepcion);
		}
	
}
		
