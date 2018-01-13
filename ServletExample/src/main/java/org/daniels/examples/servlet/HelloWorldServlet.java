package org.daniels.examples.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/helloWorld", name="helloWorldServlet")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	Map<String, String[]> requestMap = req.getParameterMap();
        resp.setStatus(200);
        resp.setHeader("Content-Type", "application/json");
        resp.getWriter().print("{\"message\": \"hello, world1!\"}");
    }

}
