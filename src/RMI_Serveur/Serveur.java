package RMI_Serveur;

import modeles.ServJeux;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public abstract class Serveur {
    public static void main (String[] argv){
        try {
            int port = 7004;
            LocateRegistry.createRegistry(port);
            Naming.rebind(("rmi://127.0.0.1:"+port+"/jeux"), new ServJeux());
            System.out.println("ServJeux Serveur prêt !");
        } catch (Exception e) {
            System.out.println("ServJeux Serveur échec " + e);
        }
    }
}
