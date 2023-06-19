/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.implementation;

import dao.ApplicationsDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Applications;
import services.ApplicationsService;

/**
 *
 * @author kanimbajustine
 */
public class ApplicationsServiceImpl extends UnicastRemoteObject implements ApplicationsService {

    public ApplicationsServiceImpl() throws RemoteException {
    }
    
    ApplicationsDao appDao = new ApplicationsDao();
    
    @Override
    public String registerApplication(Applications app) throws RemoteException {
        try{
            appDao.registerApplication(app);
            return "Application saved successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Application not saved!";
    }

    @Override
    public String updateApplication(Applications app) throws RemoteException {
        try{
            appDao.updateApplication(app);
            return "Application updated successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Data not updated!";
    }

    @Override
    public String deleteApplication(Applications app) throws RemoteException {
        try{
            appDao.deleteApplication(app);
            return "Application deleted successfully!!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Application not deleted!";
    }

    @Override
    public List<Applications> getAllApplications() throws RemoteException {
        try{
            return appDao.getAllApplications();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
