/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.implementation;

import dao.OpportunitiesDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Opportunities;
import model.Organization;
import services.OpportunitiesService;

/**
 *
 * @author kanimbajustine
 */
public class OpportunitiesServiceImpl extends UnicastRemoteObject implements OpportunitiesService {
    
    public OpportunitiesServiceImpl() throws RemoteException{

    }
    
    OpportunitiesDao oppDao = new OpportunitiesDao();

    @Override
    public String createOpp(Opportunities oppObj) throws RemoteException {
        try{
            oppDao.createOpp(oppObj);
            return "Opportunity saved successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "An error occurred!";
    }

    @Override
    public String updateOpp(Opportunities oppObj) throws RemoteException {
        try{
            oppDao.updateOpp(oppObj);
            return "Opportunity updated successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "An error occurred!";
    }

    @Override
    public String deleteOpp(Opportunities oppObj) throws RemoteException {
        try{
            oppDao.deleteOpp(oppObj);
            return "Opportunity deleted successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "An error occurred!";
    }

    @Override
    public List<Opportunities> viewOpps() throws RemoteException {
        try{
            return oppDao.viewOpps();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Opportunities> searchByLocation(Opportunities oppObj) throws RemoteException {
        try{
            return oppDao.searchByLocation(oppObj);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public List<Opportunities> viewOppByOrg(Organization org) throws RemoteException {
        try{
            return oppDao.viewOppByOrg(org);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
