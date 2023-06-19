/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kanimbajustine
 */
public class Opportunities implements Serializable {
    
    private int oppId;

    private String oppTitle;

    private String oppDescription;

    private String oppSkills;
    
    private String oppLocation;
    
    private int oppSlots;

    private Date oppStartDate;

    private Date oppEndDate;
    
    private Organization organization;
    
    private List<Volunteers> volunteer = new ArrayList<>();

    public Opportunities(int oppId, String oppTitle, String oppDescription, String oppSkills, String oppLocation, int oppSlots, Date oppStartDate, Date oppEndDate, Organization organization) {
        this.oppId = oppId;
        this.oppTitle = oppTitle;
        this.oppDescription = oppDescription;
        this.oppSkills = oppSkills;
        this.oppLocation = oppLocation;
        this.oppSlots = oppSlots;
        this.oppStartDate = oppStartDate;
        this.oppEndDate = oppEndDate;
        this.organization = organization;
    }

    public Opportunities(int oppId) {
        this.oppId = oppId;
    }

    public Opportunities() {
    }

    public int getOppId() {
        return oppId;
    }

    public void setOppId(int oppId) {
        this.oppId = oppId;
    }

    public String getOppTitle() {
        return oppTitle;
    }

    public void setOppTitle(String oppTitle) {
        this.oppTitle = oppTitle;
    }

    public String getOppDescription() {
        return oppDescription;
    }

    public void setOppDescription(String oppDescription) {
        this.oppDescription = oppDescription;
    }

    public String getOppSkills() {
        return oppSkills;
    }

    public void setOppSkills(String oppSkills) {
        this.oppSkills = oppSkills;
    }

    public String getOppLocation() {
        return oppLocation;
    }

    public void setOppLocation(String oppLocation) {
        this.oppLocation = oppLocation;
    }

    public int getOppSlots() {
        return oppSlots;
    }

    public void setOppSlots(int oppSlots) {
        this.oppSlots = oppSlots;
    }

    public Date getOppStartDate() {
        return oppStartDate;
    }

    public void setOppStartDate(Date oppStartDate) {
        this.oppStartDate = oppStartDate;
    }

    public Date getOppEndDate() {
        return oppEndDate;
    }

    public void setOppEndDate(Date oppEndDate) {
        this.oppEndDate = oppEndDate;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public List<Volunteers> getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(List<Volunteers> volunteer) {
        this.volunteer = volunteer;
    }
    
    @Override
    public String toString(){
        return "Id: "+oppId+"\nTitle: "+oppTitle+"\nDescription: "+oppDescription+"Skills: "+oppSkills+"\nLocation: "+oppLocation+"\nSlots: "+oppSlots+"\nStart: "+oppStartDate+"\nEnd: "+oppEndDate+"\n\n============================";
    }
}
