/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import services.implementation.*;

/**
 *
 * @author kanimbajustine
 */
public class Server {
    public static void main(String[] args) {
        try{
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry reg = LocateRegistry.createRegistry(8000);
            
            reg.rebind("organization", new OrganizationServiceImpl());
            reg.rebind("opportunities", new OpportunitiesServiceImpl());
            reg.rebind("volunteers", new VolunteersServiceImpl());
            reg.rebind("applications", new ApplicationsServiceImpl());
            System.out.println("Server is running on port 8000");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
