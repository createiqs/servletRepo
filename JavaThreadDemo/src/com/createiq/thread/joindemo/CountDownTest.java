package com.createiq.thread.joindemo;

public class CountDownTest {
	public static void main(String[] args) {
		CountDown countDown=new CountDown();
		CountDownThread ct=new CountDownThread(countDown);
		Thread t1=new Thread(ct);
		t1.setName("Thread 1");
		t1.start();
		// thread stack area lo count 
		// first thread one invoke
		// second thread  invoke
		Thread t2=new Thread(ct);
		t2.setName("Thread 2");
		t2.start();
	}
	
	// heap area instance 

}
