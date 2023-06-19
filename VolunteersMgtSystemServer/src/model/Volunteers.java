/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;
/**
 *
 * @author kanimbajustine
 */

@Entity
public class Volunteers implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "v_id")
    private int id;
    
    @Column(name = "v_name")
    private String name;
    
    @Column(name = "v_email")
    private String email;
    
    @Column(name = "v_phone")
    private String phone;
    
    @Column(name = "v_skills")
    private String skills;
    
    @ManyToMany(mappedBy = "volunteer")
    private List<Opportunities> opportunities = new ArrayList<>();

    public Volunteers(int id, String name, String email, String phone, String skills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.skills = skills;
    }

    public Volunteers(int id) {
        this.id = id;
    }

    public Volunteers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public List<Opportunities> getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(List<Opportunities> opportunities) {
        this.opportunities = opportunities;
    }
    
}
