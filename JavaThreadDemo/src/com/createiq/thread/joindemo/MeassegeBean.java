package com.createiq.thread.joindemo;

public class MeassegeBean {

	private String message;
	private boolean flag = true;

	public MeassegeBean(String message) {
		this.message = message;
	}

	public String read() {
		while (flag) {

		}
		flag = false;
		return message;

	}

	public void write() {

		while (flag != false) {

		}
		flag = true;

	}

}
