package com.createiq.thread.demo;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "  " + i);
//			try {
//				Thread.sleep(1000);
////				Thread.onSpinWait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

	}

}
