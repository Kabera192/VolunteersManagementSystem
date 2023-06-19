/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.implementation;

import dao.VolunteerDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Volunteers;
import services.VolunteersService;

/**
 *
 * @author kanimbajustine
 */
public class VolunteersServiceImpl extends UnicastRemoteObject implements VolunteersService {
    
    public VolunteersServiceImpl() throws RemoteException{
        
    }
    
    VolunteerDao volDao = new VolunteerDao();

    @Override
    public String createVol(Volunteers volObj) throws RemoteException {
        try{
            volDao.registerVolunteer(volObj);
            return "Volunteer registered successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "An error occurred!";
    }

    @Override
    public String updateVol(Volunteers volObj) throws RemoteException {
        try{
            volDao.updateVolunteer(volObj);
            return "Volunteer updated successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "An error occurred!";
    }

    @Override
    public String deleteVol(Volunteers volObj) throws RemoteException {
        try{
            volDao.deleteVolunteer(volObj);
            return "Volunteer deleted successfully!";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "An error occurred!";
    }

    @Override
    public List<Volunteers> viewVols() throws RemoteException {
        try{
            return volDao.viewVolunteers();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public Volunteers searchById(Volunteers volObj) throws RemoteException {
        try{
            return volDao.searchVolunteerById(volObj);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public Volunteers isInDb(Volunteers volObj) throws RemoteException {
        try{
            return volDao.checkVolInDb(volObj);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
