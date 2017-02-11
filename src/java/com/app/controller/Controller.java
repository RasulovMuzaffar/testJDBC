/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.model.Table2Model;
import com.db.ConnDB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muzaffar
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Table2Model model = new Table2Model();
        List table2 = model.getTable2FromDB();
        request.setAttribute("list", table2);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String flag = null;
        String text = null;
        int int_ = 0;
        try {
            flag = request.getParameter("flag");
            text = request.getParameter("text");
            int_ = Integer.parseInt(request.getParameter("int_"));
        } catch (Exception e) {
            System.out.println("problema " + e);
        }

        Connection conn = null;
        PreparedStatement ps = null;
        if (flag.equals("add")) {
            Table2Model model = new Table2Model();
            model.insertToTable2(text, int_);
            List table2 = model.getTable2FromDB();
            request.setAttribute("list", table2);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if (flag.equals("del")) {

        }
    }

}
