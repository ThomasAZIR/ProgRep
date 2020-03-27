package modeles;


import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

//Remote Interface
public interface ServJeuxInterface extends Remote {
    //Test
    public String echo () throws RemoteException;


}