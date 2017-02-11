/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

import com.app.controller.Controller;
import com.db.ConnDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muzaffar
 */
public class Table2Model {

    public List getTable2FromDB() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Table2Info m = null;
        List listM = new ArrayList();
        Connection conn = null;

        String sql = "select id, text, int_ from table2";
        ConnDB connDB = new ConnDB();
        try {
            conn = connDB.getConn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                m = new Table2Info(rs.getInt("id"), rs.getString("text"), rs.getInt("int_"));
                listM.add(m);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps = null;
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            rs = null;
            connDB.closeConn(conn);
        }
        return listM;

    }
}
