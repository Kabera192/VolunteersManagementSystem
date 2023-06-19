/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Applications;
import org.hibernate.*;

/**
 *
 * @author kanimbajustine
 */
public class ApplicationsDao {
    public void registerApplication(Applications app){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(app);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateApplication(Applications app){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(app);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteApplication(Applications app){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(app);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Applications> getAllApplications(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Applications> appList = ss.createQuery("from Applications").list();
            ss.close();
            return appList; 
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
