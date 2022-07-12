package com.npci.SpringBootApi.commonClass;

import java.time.LocalDateTime;

public class APIResponse {
	
	private final boolean success;
    private final String message;
    
    public APIResponse(boolean success, String message) {
    	this.success = success;
        this.message = message;
    }

	public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return LocalDateTime.now().toString();
    }
	 
	 
	/*private String message;
	private String description;
	public APIResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public APIResponse(String message, String description) {
		super();
		this.message = message;
		this.description = description;
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
	@Override
	public String toString() {
		return "ResponsePage [message=" + message + ", description=" + description + "]";
	}*/
	 /*
     private Object data;
	 private Object error;
	 
	 public APIResponse(Integer status, Object data, Object error) {
		super();
		this.status = status;
		this.data = data;
		this.error = error;
	 }

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}*/
	
	//private String status;
	
	
	///
	///
	 
}
