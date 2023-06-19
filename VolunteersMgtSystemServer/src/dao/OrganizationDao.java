/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Organization;
import org.hibernate.*;

/**
 *
 * @author kanimbajustine
 */
public class OrganizationDao {
    
    public void createOrg(Organization orgObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(orgObj);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateOrg(Organization orgObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(orgObj);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteOrg(Organization orgObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(orgObj);
            tr.commit();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Organization> viewOrgs(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Organization> orgList = ss.createQuery("from Organization").list();
            ss.close();
            return orgList;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public Organization searchOrgById(Integer orgId){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("select orgObj from Organization orgObj where orgObj.orgId = :orgId");
            query.setParameter("orgId", orgId);
            Organization org = (Organization) query.uniqueResult();
            ss.close();
            return org;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public Organization logInSearch(Organization orgObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("select orgObj from Organization orgObj where orgObj.orgEmail= :email AND orgObj.orgPwd= :password");
            query.setParameter("email", orgObj.getOrgEmail());
            query.setParameter("password", orgObj.getOrgPwd());
            
            Organization org = (Organization) query.uniqueResult();
            return org;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
