package com.createiq.thread.demo;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) throws InterruptedException {

		MyThread t = new MyThread(); // a thread in new born stage.....
		t.start(); // the is created and moved to runnable state
//		t.start();

	}

}
