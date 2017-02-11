/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import com.db.ConnDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muzaffar
 */
@WebServlet(name = "Start", urlPatterns = {"/Start"})
public class Start extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//
//            conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/spring", "root", "123456");
//
//            System.out.print(conn.getMetaData().getDatabaseProductName());
//            System.out.print(conn.getMetaData().getDatabaseProductVersion());
//        } catch (Exception e) {
//            System.out.println("" + e);
//        } finally {
//            try {
//                conn.close();
//            } catch (Exception sqle) {
//                // TODO: Add catch code
//            }
//        }
//        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
