package com.createiq.thread.demo;

public class ThreadTestEx {
	public static void main(String[] args) throws InterruptedException {

		ThreadExample t1 = new ThreadExample();
		t1.start();

		ThreadExample t2 = new ThreadExample();
		t2.start();
//		t2.join();
		for (int i = 0; i <= 5; i++) {
//			Thread.yield();
			System.out.println("main thread");
		}
		ThreadDemo demo = new ThreadDemo();
		Thread tr = new Thread(demo);
		tr.start();
		tr.join();

	}

}
