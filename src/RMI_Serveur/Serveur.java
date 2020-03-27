package RMI_Serveur;

import controleur.allumettesControleur;
import controleur.othelloControleur;
import controleur.penduControleur;
import modeles.ServJeux;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

public abstract class Serveur {
    public static void main (String[] argv){
        try {
            int port = 8000;
            LocateRegistry.createRegistry(port);
            Naming.rebind(("rmi://127.0.0.1:"+port+"/jeux"), new ServJeux());
            System.out.println("ServJeux Serveur prêt !");
        } catch (Exception e) {
            System.out.println("ServJeux Serveur échec " + e);
        }
        /*try {
            int portPendu = 8000;
            int portAlu = 8001;
            int portOte = 8002;
            LocateRegistry.createRegistry(portPendu);
            Naming.rebind ("rmi://localhost:"+portPendu+"/pendu", new ServJeux());
            LocateRegistry.createRegistry(portAlu);
            Naming.rebind("rmi://localhost:" + portAlu + "/alu",   new ServJeux());
            LocateRegistry.createRegistry(portOte);
            Naming.rebind("rmi://localhost:" + portOte + "/ote",  new ServJeux());
            System.out.println ("Serveur OK ! ");
        } catch (Exception e) {
            System.out.println ("Serveur : " + e);
        }*/
    }
}
