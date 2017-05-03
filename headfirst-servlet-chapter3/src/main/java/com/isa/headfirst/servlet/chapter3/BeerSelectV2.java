package com.isa.headfirst.servlet.chapter3;

import com.isa.headfirst.servlet.chapter3.model.BeerExpert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BeerSelectV2 extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(BeerSelectV2.class);

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.info("Serving Post request");
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List<String> result = be.getBrands(c);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection Advice<br>");
        result.stream()
                .forEachOrdered(advice -> out.print(String.format("<br>try: %s", advice)));
    }
}
