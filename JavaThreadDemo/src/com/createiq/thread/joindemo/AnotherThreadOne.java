package com.createiq.thread.joindemo;

import com.createiq.thread.demo.ThreadColor;

public class AnotherThreadOne implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
			System.out.println(ThreadColor.ANSI_PURPLE + " " + Thread.currentThread().getName() + " " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
