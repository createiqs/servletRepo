package com.createiq.thread.joindemo;

import com.createiq.thread.demo.ThreadColor;

public class ThreadJoinTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(ThreadColor.ANSI_RED + " " + Thread.currentThread().getName() + " " + i);

		}

		ThreadOne t1 = new ThreadOne();
		t1.setName(" frist second");
//		t1.setPriority(5);
		t1.start();
	
		ThreadOne t2 = new ThreadOne();
//		t2.setPriority(5);
		t2.setName("second thread");
		t2.start();
		try {
			t2.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
