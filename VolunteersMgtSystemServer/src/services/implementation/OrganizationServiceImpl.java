/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.implementation;

import dao.OrganizationDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Organization;
import services.OrganizationService;

/**
 *
 * @author kanimbajustine
 */
public class OrganizationServiceImpl extends UnicastRemoteObject implements OrganizationService{
    
    public OrganizationServiceImpl() throws RemoteException{
        
    }
    
    OrganizationDao orgDao = new OrganizationDao();

    @Override
    public String registerOrg(Organization orgObj) throws RemoteException {
        try{
            orgDao.createOrg(orgObj);
            return "Organization saved successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "An error occurred!";
    }

    @Override
    public String updateOrg(Organization orgObj) throws RemoteException {
        try{
            orgDao.updateOrg(orgObj);
            return "Organization updated successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "An error occurred!";
    }

    @Override
    public String deleteOrg(Organization orgObj) throws RemoteException {
        try{
            orgDao.deleteOrg(orgObj);
            return "Organization deleted successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "An error occurred!";
    }

    @Override
    public List<Organization> viewOrgs() throws RemoteException {
        try{
            return orgDao.viewOrgs();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public Organization searchOrgById(Integer orgId) throws RemoteException {
        try{
            return orgDao.searchOrgById(orgId);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public Organization logInSearch(Organization orgObj) throws RemoteException {
        try{
            return orgDao.logInSearch(orgObj);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
