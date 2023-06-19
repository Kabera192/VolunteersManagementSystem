/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author kanimbajustine
 */
public class Applications implements Serializable {
    
    private Integer id;
    
    private String status;

    public Applications() {
    }

    public Applications(Integer id, String status) {
        this.id = id;
        this.status = status;
    }

    public Applications(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
