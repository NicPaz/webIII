package com.example.requisicao;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/cabecalhos")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String a = request.getHeader("host");
        String b = request.getHeader("user-agent");
        String c = request.getHeader("accept-encoding");
        String d = request.getHeader("accept-language");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Host: " + a + "</h1>");
        out.println("<h1> User Agent: " + b + "</h1>");
        out.println("<h1> Accept Encoding: " + c + "</h1>");
        out.println("<h1> Accept Language: " + d + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}