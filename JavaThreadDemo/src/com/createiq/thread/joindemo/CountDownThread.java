package com.createiq.thread.joindemo;

public class CountDownThread implements Runnable{

	public CountDown countDown;

	public CountDownThread(CountDown countDown) {
		this.countDown = countDown;
	}
	
	@Override
	public void run() {
	  countDown.doCount();
	}
	
}
