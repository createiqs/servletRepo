package com.createiq.thread.joindemo;

import com.createiq.thread.demo.ThreadColor;

public class JoinTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(ThreadColor.ANSI_RED + " " + Thread.currentThread().getName() + " " + i);
		}
		
		ThreadOne t1 = new ThreadOne();
		t1.setName(" frist second");
		t1.start();
		 
		
		Thread t2=new Thread(new AnotherThreadOne());
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
