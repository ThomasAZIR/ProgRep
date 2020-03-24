package modeles;


import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modeles.Caractere;

//Remote Interface
public interface ServJeuxInterface extends Remote {
    //Test
    public String echo () throws RemoteException;
    //Pendu
    public String motPendu() throws RemoteException;
    //Morpion
    public abstract Caractere[][] getGrille() throws RemoteException;
    public abstract Caractere setCaract(int x, int y) throws RemoteException;
    public abstract String getGagnant() throws RemoteException;
    public abstract void demarrerMorpion() throws RemoteException;
    public abstract void redemarrerMorpion() throws RemoteException;
    public abstract boolean finMorpion() throws RemoteException;
    //Taquin
    public boolean testVictoire(ArrayList grille) throws RemoteException;
    public abstract ArrayList initGrille() throws RemoteException;
    public abstract ArrayList clicCase(String b, ArrayList gTaquin) throws RemoteException;

}