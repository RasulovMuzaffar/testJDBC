/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

/**
 *
 * @author Muzaffar
 */
public class Table2Info {
private int id;
private String text;
private int int_;

    public Table2Info() {
    }

    public Table2Info(int id, String text, int int_) {
        this.id = id;
        this.text = text;
        this.int_ = int_;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getInt_() {
        return int_;
    }

    public void setInt_(int int_) {
        this.int_ = int_;
    }
}
