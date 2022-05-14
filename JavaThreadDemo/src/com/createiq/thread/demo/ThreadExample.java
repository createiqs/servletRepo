package com.createiq.thread.demo;

public class ThreadExample extends Thread {
	private int i;

	@Override
	public void run() {

		System.out.println("before sleep");
		for (i = 0; i <= 5; i++) {
			System.out.println(" child thread" + i);
//			try {
//				Thread.sleep(2000);
//				System.out.println(" child thread" + i);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println("before sleep");
	}

}
