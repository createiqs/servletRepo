package com.vidvaan.logincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginRequestFilter
 */
public class LoginRequestFilter implements Filter {

	public LoginRequestFilter() {
	}

	public void destroy() {
		System.out.println("filter destroyed " + this.getClass().getName());
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("pre processing the request before going to login servlet..." + this.getClass().getName());
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		String user = req.getParameter("user");
		String password = request.getParameter("pwd");
		String submitType = request.getParameter("submitType");
		if ((user == null)&& password.equals("admin") && submitType.equals("login") ) {
			writer.println("<h3 style='color:red'>Sorry username or password incorrect!!!</h3>");
			req.getRequestDispatcher("login.html").include(request, response);
		} else {
			chain.doFilter(request, response);

		}
		writer.close();
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter init method invoked......" + this.getClass().getName());
	}

}
