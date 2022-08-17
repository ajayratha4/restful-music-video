package com.restfulmusicvideo.restfulmusicvideo.common;

import org.springframework.stereotype.Service;

@Service
public class Response {

	private int status;
	private Object data;
	private Object error;

	public Response() {
		super();

	}

	public Response(int status, Object data, Object error) {
		super();
		this.status = status;
		this.data = data;
		this.error = error;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
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
	}

}
