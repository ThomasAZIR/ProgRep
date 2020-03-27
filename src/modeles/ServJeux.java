package modeles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Random;

//Implémentation
public class ServJeux extends UnicastRemoteObject implements ServJeuxInterface {

    public ServJeux () throws RemoteException {
        super();
    }
    public String echo () throws RemoteException {
        return "#ECHO";
    }


}