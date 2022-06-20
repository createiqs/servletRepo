package com.vidvaan.logincontroller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListner implements HttpSessionListener {
	ServletContext context = null;
	static int totalUsersCount, currentUserCount = 0;

	public MyHttpSessionListner() {
	}

	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		System.out.println("session created method has been called in "+this.getClass().getName());
		totalUsersCount++;
		currentUserCount++;
		context=httpSessionEvent.getSession().getServletContext();
		context.setAttribute("totalUsers", totalUsersCount);
		context.setAttribute("currentUsers", currentUserCount);
	}

	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		System.out.println("session destroy method has been called in "+this.getClass().getName());
		currentUserCount--;
		context.setAttribute("currentUsers", currentUserCount);
	}

}
