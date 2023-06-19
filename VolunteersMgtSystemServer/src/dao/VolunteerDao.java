/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Volunteers;
import org.hibernate.*;

/**
 *
 * @author kanimbajustine
 */
public class VolunteerDao {
    
    public void registerVolunteer(Volunteers volObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(volObj);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateVolunteer(Volunteers volObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(volObj);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteVolunteer(Volunteers volObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(volObj);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Volunteers> viewVolunteers(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Volunteers> volList = ss.createQuery("from Volunteers").list();
            ss.close();
            return volList;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public Volunteers searchVolunteerById(Volunteers volObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Volunteers vol = (Volunteers) ss.createQuery("select volObj from Volunteers volObj where volObj.id="+volObj.getId());
            ss.close();
            return vol;
        }catch(Exception e){
            
        }
        return null;
    }
    
    public Volunteers checkVolInDb(Volunteers volObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query q = ss.createQuery("select volObj from Volunteers volObj where volObj.email := email");
            q.setParameter("email", volObj.getEmail());
            Volunteers vol = (Volunteers) q.uniqueResult();
            ss.close();
            return vol;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
