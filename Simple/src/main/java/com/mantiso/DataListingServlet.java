package com.mantiso;

import com.mantiso.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shgaikwa on 7/21/2016.
 * Lab-MVC & Directive Data Listing
 */
public class DataListingServlet extends HttpServlet {

    List<Product> li;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ApplicationSettings applicationSettings=new ApplicationSettings();
        List<Product> products=getProducts();
        List<String> title=getTitles();

        applicationSettings.setProducts(products);
        applicationSettings.setTitle(title);

        RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/WEB-INF/datalist.jsp");
        req.setAttribute("data",applicationSettings.getProducts());
        req.setAttribute("title",applicationSettings.getTitle());
        dispatcher.forward(req,resp);
    }

    public List<String> getTitles(){
        List<String> title=new ArrayList<>();
        title.add("Name");
        title.add("Description");
        title.add("Quantity");
        title.add("Price/product");

        return title;
    }

    public List<Product> getProducts(){

        List<Product> list=new ArrayList<>();

        Product p1=new Product();
        p1.setName("iPhone");
        p1.setDesc("Rose Gold, 6S plus");
        p1.setPrice(700);
        p1.setQuantity(50);
        list.add(p1);

        Product p2=new Product();
        p2.setName("Dell laptop");
        p2.setDesc("Black, 15 inces, i7, 16GB ram");
        p2.setPrice(500);
        p2.setQuantity(20);
        list.add(p2);

        Product p3=new Product();
        p3.setName("Plantronics Headsets");
        p3.setDesc("red and black, Balckwire 320");
        p3.setPrice(120);
        p3.setQuantity(30);
        list.add(p3);

        Product p4=new Product();
        p4.setName("logitech keyboard");
        p4.setDesc("Balck, wireless");
        p4.setPrice(49);
        p4.setQuantity(50);
        list.add(p4);

        return list;
    }
}
