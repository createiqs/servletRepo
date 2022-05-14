package com.createiq.thread.demo;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		CountDown countDown=new CountDown();
		CountThread t1=new CountThread(countDown);
		t1.setName("Thread 1");
		CountThread t2=new CountThread(countDown);
		t2.setName("Thread 2");
		t1.start();
		t2.start();
		t2.join();
//		t2.wait();
		
//		Message message = new Message();
//        (new Thread(new Writer(message))).start();
//        (new Thread(new Reader(message))).start();
//    }
}
	}

//}
