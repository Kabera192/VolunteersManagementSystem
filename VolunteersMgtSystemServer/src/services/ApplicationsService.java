/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Applications;

/**
 *
 * @author kanimbajustine
 */
public interface ApplicationsService extends Remote {
    String registerApplication(Applications app) throws RemoteException;
    String updateApplication(Applications app) throws RemoteException;
    String deleteApplication(Applications app) throws RemoteException;
    List<Applications> getAllApplications() throws RemoteException;
    
}
