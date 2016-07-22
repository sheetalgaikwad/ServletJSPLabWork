package com.mantiso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Created by shgaikwa on 7/18/2016.
 */

public class SimpleServlet extends HttpServlet {

    /**
     * Lab-First Projects and Simple First Servlets
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().write(LocalDateTime.now().toString());

        String name=req.getParameter("name");
        if(name!=null){
            resp.getWriter().printf("Hello %s",name);
        }else{
            resp.getWriter().write("Please enter name value");
        }
    }


    /**
     * Lab-Login Page
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().write(LocalDateTime.now().toString());

        String actualUserName="sheetalgaikwad";
        String actualPassword="abcd1234";

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        Cookie user_id =new Cookie("username",username);
        user_id.setMaxAge(60*60*24);
        resp.addCookie(user_id);
        if(username!=null && username.equals(actualUserName) && password!=null && password.equals(actualPassword)){
            resp.getWriter().printf("Welcome %s",username);
        }else{
            resp.sendRedirect("/WEB-INF/badlogin.html");
        }
    }
}
