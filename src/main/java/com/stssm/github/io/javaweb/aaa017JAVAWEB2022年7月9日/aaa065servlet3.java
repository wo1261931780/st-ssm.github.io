package com.stssm.github.io.javaweb.aaa017JAVAWEB2022年7月9日;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa017JAVAWEB2022年7月9日
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-14-35  星期六
 * @description
 * @return
 * @exception
 */
public class aaa065servlet3 implements Servlet {
	/**
	 * @param servletConfig
	 * @throws ServletException
	 */
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {

	}

	/**
	 * @return
	 */
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	/**
	 * @param servletRequest
	 * @param servletResponse
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		System.out.println("二者的请求方式不同");
		HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
		HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
		String requestMethod = httpRequest.getMethod();// 根据请求体的方法类型，来判断后面使用什么方法
		switch (requestMethod) {
			case "get":
				doGet(servletRequest, servletResponse);
				break;
			case "post":
				doPost(servletRequest, servletResponse);
				break;
			default:
				break;
		}

	}

	/**
	 * 使用protected修饰符，子类可以看到方法
	 */
	protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
	}

	protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
	}

	/**
	 * @return
	 */
	@Override
	public String getServletInfo() {
		return null;
	}

	/**
	 *
	 */
	@Override
	public void destroy() {

	}
}
