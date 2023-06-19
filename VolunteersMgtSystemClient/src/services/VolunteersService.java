/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Volunteers;

/**
 *
 * @author kanimbajustine
 */
public interface VolunteersService extends Remote {
    String createVol(Volunteers volObj) throws RemoteException;
    String updateVol(Volunteers volObj) throws RemoteException;
    String deleteVol(Volunteers volObj) throws RemoteException;
    List<Volunteers> viewVols() throws RemoteException;
    Volunteers searchById(Volunteers volObj) throws RemoteException;
    Volunteers isInDb(Volunteers volObj) throws RemoteException;
}
