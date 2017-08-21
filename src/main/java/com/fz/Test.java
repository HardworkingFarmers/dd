package com.fz;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by webrx on 2017-08-17.
 */
//@WebServlet("/test.do")
@WebServlet(urlPatterns = {"/aa", "/test.do", "/haha"})
public class Test extends HttpServlet {

   @Override
   public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

       HttpServletResponse resp = (HttpServletResponse)res;

       resp.setCharacterEncoding("utf-8");
       resp.setContentType("text/html;charset-utf-8");
       PrintWriter out = resp.getWriter();
       out.print("搞基吧");

   }
}
