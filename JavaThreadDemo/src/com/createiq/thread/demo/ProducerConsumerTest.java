package com.createiq.thread.demo;

public class ProducerConsumerTest {
public static void main(String[] args) {
	Message message=new Message();
	Writer writer=new Writer(message);
	Thread t1=new Thread(writer);
	t1.start();
	
	Reader reader=new Reader(message);
	Thread t2=new Thread(reader);
	t2.start();
	
}
}
