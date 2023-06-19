/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanimbajustine
 */
public class Organization implements Serializable {
    
    private int orgId;
    
    private String orgName;
    
    private String orgEmail;
    
    private String orgPwd;
    
    private List<Opportunities> opportunities = new ArrayList<>();

    public Organization(int orgId, String orgName, String orgEmail, String orgPwd) {
        this.orgId = orgId;
        this.orgName = orgName;
        this.orgEmail = orgEmail;
        this.orgPwd = orgPwd;
    }

    public Organization(int orgId) {
        this.orgId = orgId;
    }

    public Organization() {
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getOrgPwd() {
        return orgPwd;
    }

    public void setOrgPwd(String orgPwd) {
        this.orgPwd = orgPwd;
    }

    public List<Opportunities> getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(List<Opportunities> opportunities) {
        this.opportunities = opportunities;
    }
}
