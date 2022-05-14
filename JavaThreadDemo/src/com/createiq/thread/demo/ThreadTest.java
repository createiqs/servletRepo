package com.createiq.thread.demo;

public class ThreadTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main thread.......");
		ThreadDemo r=new ThreadDemo();
	 
//		Thread t1=new Thread(r);
		r.setDaemon(true);
		r.start();

		Thread t2=new Thread(r);
		t2.start();
	 
		
		

//		Thread t3=new Thread(r);
//		t3.start();
//		
//		t3.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.MIN_PRIORITY);
//		t1.setPriority(Thread.MIN_PRIORITY);
//		
	
	
		
	}

}
