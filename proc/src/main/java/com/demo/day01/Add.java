package com.demo.day01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Add")
public class Add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String x=request.getParameter("a");
        String y=request.getParameter("b");
        int m=Integer.parseInt(x);
        int n=Integer.parseInt(y);
        int sum=m+n;
        String result=String.valueOf(sum);
        response.getWriter().append(result);
    }
}
