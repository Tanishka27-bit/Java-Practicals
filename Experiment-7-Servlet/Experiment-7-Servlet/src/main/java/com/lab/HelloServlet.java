package com.lab;

import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset=UTF-8");
        String n = req.getParameter("name");
        if (n == null || n.isBlank())
            n = "Student";
        n = n.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'",
                "&#x27;");
        res.getWriter().println("<!doctype html><html><body><h1>Hello, " + n + "!</h1></body></html>");
    }
}
