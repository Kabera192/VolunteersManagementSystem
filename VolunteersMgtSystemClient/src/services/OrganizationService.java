/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Organization;

/**
 *
 * @author kanimbajustine
 */
public interface OrganizationService extends Remote {
    String registerOrg(Organization orgObj) throws RemoteException;
    String updateOrg(Organization orgObj) throws RemoteException;
    String deleteOrg(Organization orgObj) throws RemoteException;
    List<Organization> viewOrgs() throws RemoteException;
    Organization searchOrgById(Integer orgId) throws RemoteException;
    Organization logInSearch(Organization orgObj) throws RemoteException;
}
