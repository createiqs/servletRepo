package com.createiq.thread.joindemo;

import com.createiq.thread.demo.ThreadColor;

public class CountDown {

	private int i;

	public void doCount() {
		String color;

		switch (Thread.currentThread().getName()) {
		case "Thread 1":
			color = ThreadColor.ANSI_CYAN;
			break;
		case "Thread 2":
			color = ThreadColor.ANSI_PURPLE;
		default:
			color = ThreadColor.ANSI_RED;
		}

		synchronized (color) {

			for (i = 1; i <= 5; i++) {
				System.out.println(color + Thread.currentThread().getName() + " i=" + i);
			}
		}

	}

}
