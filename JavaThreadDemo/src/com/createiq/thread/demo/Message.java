package com.createiq.thread.demo;

public class Message {

	private String message;
	private boolean empty = true;

	public synchronized String read() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		empty = true;
		notifyAll();
		return message;
	}

	public synchronized void write(String message) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		empty = false;
		this.message = message;
		notifyAll();
	}

}
