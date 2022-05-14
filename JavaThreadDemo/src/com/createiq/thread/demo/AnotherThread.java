package com.createiq.thread.demo;

public class AnotherThread extends Thread {

	@Override
	public void run() {
		System.out.println(ThreadColor.ANSI_BLUE + "Hello from " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up");
			return;
		}
		System.out.println(ThreadColor.ANSI_BLUE + "Seconds passed and I'm awake  " + Thread.currentThread().getName());
	}

}
