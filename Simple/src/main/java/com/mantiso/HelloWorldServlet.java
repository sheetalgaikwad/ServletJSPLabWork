package com.mantiso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by shgaikwa on 7/18/2016.
 */

public class HelloWorldServlet extends HttpServlet {

    /**
     * Lab-Servlet Forwarding-type Hello World
     * Lab-Expression Language Hello World
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String message="Hello World!";
        LocalDate date = LocalDate.now();
        DayOfWeek dow = date.getDayOfWeek();
        String message="Welcome, today is "+ dow+"!";
        RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/helloworld.jsp");
        req.setAttribute("message",message);
        dispatcher.forward(req,resp);
    }
}
