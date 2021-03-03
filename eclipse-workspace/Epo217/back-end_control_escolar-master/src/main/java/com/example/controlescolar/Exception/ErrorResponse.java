package com.example.controlescolar.Exception;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="error")
public class ErrorResponse {
		
	
			
			public ErrorResponse(String message, List<String> details, String[] dtos) {
		super();
		this.message = message;
		this.details = details;
		this.dtos = dtos;
	}
			private String message;
			private List<String> details;
			private String[] dtos;
			public String getMessage() {
				return message;
			}
			public void setMessage(String message) {
				this.message = message;
			}
			public List<String> getDetails() {
				return details;
			}
			public void setDetails(List<String> details) {
				this.details = details;
			}
			public String[] getDtos() {
				return dtos;
			}
			public void setDtos(String[] dtos) {
				this.dtos = dtos;
			}
			
}
