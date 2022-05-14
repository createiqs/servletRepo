package com.createiq.thread.demo;

public class CountThread extends Thread {

	private CountDown countDown;

	public CountThread(CountDown countDown) {

		this.countDown = countDown;
	}

	@Override
	public void run() {
		countDown.doCountDown();
	}

}
