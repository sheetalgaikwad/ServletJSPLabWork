package com.mantiso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shgaikwa on 7/18/2016.
 */

public class HelloWorldServlet extends HttpServlet {

    /**
     * Lab-Servlet Forwarding-type Hello World
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String message="Hello World!";
        RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/helloworld.jsp");
        req.setAttribute("message",message);
        dispatcher.forward(req,resp);
    }
}
