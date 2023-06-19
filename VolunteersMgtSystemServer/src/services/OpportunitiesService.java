/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.*;
import java.util.List;
import model.Opportunities;
import model.Organization;

/**
 *
 * @author kanimbajustine
 */
public interface OpportunitiesService extends Remote {
    String createOpp(Opportunities oppObj) throws RemoteException;
    String updateOpp(Opportunities oppObj) throws RemoteException;
    String deleteOpp(Opportunities oppObj) throws RemoteException;
    List<Opportunities> viewOpps() throws RemoteException;
    List<Opportunities> searchByLocation(Opportunities oppObj) throws RemoteException;
    List<Opportunities> viewOppByOrg(Organization org) throws RemoteException;
}
