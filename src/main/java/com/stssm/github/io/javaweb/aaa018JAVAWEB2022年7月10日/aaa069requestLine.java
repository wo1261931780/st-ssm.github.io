package com.stssm.github.io.javaweb.aaa018JAVAWEB2022年7月10日;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:demo
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-08-20  星期日
 * @description
 * @return
 * @exception
 */
@WebServlet(urlPatterns = "/showMe", loadOnStartup = 1)
public class aaa069requestLine extends HttpServlet {
	// 请求转发，实际上就是根据请求，来完成不同服务之间的跳转
	// 在http过程中
	// request和response对象，都是由tomcat创建的


	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		System.out.println("我是请求对象：" + req);// org.apache.catalina.connector.RequestFacade@30cfbefb
		// 组织的链接对象
		// 耦合性降低，可维护性增强
		String method = req.getMethod();
		// ---------------------------------------------------------------------
		System.out.println("我是请求类型：" + method);// get或者post
		String contextPath = req.getContextPath();
		System.out.println("我是内容路径名称：" + contextPath);
		// 项目启动的完整路径是：http://localhost:8089/show_war/showMe
		// 这里获取具体的内容路径，可以拿到我的包名/show_war
		// ---------------------------------------------------------------------
		StringBuffer requestURL = req.getRequestURL();
		System.out.println("我是内容完整路径：" + requestURL);
		// http://localhost:8089/show_war/showMe
		// ---------------------------------------------------------------------
		// 然后还有一个获取一部分路径的
		String requestURI = req.getRequestURI();
		System.out.println("我是获取内容路径：" + requestURI);
		// /show_war/showMe
		// 这里的路径就是内容根路径，前缀相同的情况下，可以用来作为请求来源的判断依据
		// ---------------------------------------------------------------------
		String queryString = req.getQueryString();
		System.out.println("我是请求内容：" + queryString);
		// 以上都是请求行的数据
		// 具体到请求体和请求头，需要用另一种方法

	}

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doPost(req, resp);
	}
}
