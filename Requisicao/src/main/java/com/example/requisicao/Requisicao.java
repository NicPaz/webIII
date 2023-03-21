package com.example.requisicao;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/requisicao")
public class Requisicao extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String metodo = req.getMethod();
        String uriPedido = req.getRequestURI();
        String protocolo = req.getProtocol();
        String endRemoto = req.getRemoteAddr();

        PrintWriter out = resp.getWriter();

        out.println("<h1>Metodo:" + metodo + "</h1>");
        out.println("<h1>URI do Pedido: " + uriPedido + "</h1>");
        out.println("<h1>Protocolo: " + protocolo + "</h1>");
        out.println("<h1>Endereco Remoto:" + endRemoto + "</h1>");

    }

    public void destroy() {
    }
}