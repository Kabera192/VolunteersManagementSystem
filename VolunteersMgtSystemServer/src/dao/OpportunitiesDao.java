/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.Opportunities;
import model.Organization;
import org.hibernate.*;

/**
 *
 * @author kanimbajustine
 */
public class OpportunitiesDao {
    
    public void createOpp(Opportunities oppObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(oppObj);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateOpp(Opportunities oppObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(oppObj);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteOpp(Opportunities oppObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(oppObj);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Opportunities> viewOpps(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Opportunities> opps = ss.createQuery("from Opportunities").list();
            ss.close();
            return opps; 
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Opportunities> searchByLocation(Opportunities oppObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("select oppObj from Opportunities oppObj where oppObj.oppLocation = :oppLocation");
            query.setParameter("oppLocation", oppObj.getOppLocation());
            
            List<Opportunities> opps = query.list();
            return opps;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Opportunities> viewOppByOrg(Organization org){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Opportunities> opps = ss.createQuery("select oppObj from Opportunities oppObj where oppObj.organization.orgId="+org.getOrgId()).list();
            return opps;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
