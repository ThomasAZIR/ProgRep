package modeles;


import java.rmi.*;

//Remote Interface
public interface ServJeuxInterface extends Remote {
    //Test
    public String echo () throws RemoteException;


}