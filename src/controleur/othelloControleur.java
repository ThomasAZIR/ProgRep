package controleur;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javafx.scene.control.*;
import modeles.ServJeuxInterface;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import modeles.ServJeuxInterface;

public class othelloControleur {

    @FXML MenuBar menu;


    //Initialisation menu
    public void menuClic(ActionEvent evt) throws RemoteException {
        MenuItem menuClique = (MenuItem) evt.getTarget();
        String menuLabel = menuClique.getText();

        if ("Rejouer".equals(menuLabel)){
            //recup de la fenetre a l'aide d'un element
            Stage stageCourant = (Stage) menu.getScene().getWindow();
            stageCourant.close();
            //lancement de la seconde fenetre
            try{
                Stage stage = new Stage();
                BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../Vues/pendu.fxml"));
                Scene scene = new Scene(root); //redimmension auto
                //stage.initModality(Modality.APPLICATION_MODAL); //pour cacher la zone fenetre de windows
                //stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("Pendu");
                stage.setScene(scene);
                stage.setResizable(false);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if ("Retour".equals(menuLabel)){
            //recup de la fenetre a l'aide d'un element
            Stage stageCourant = (Stage) menu.getScene().getWindow();
            stageCourant.close();
            //lancement de la seconde fenetre
            try{
                Stage stage = new Stage();
                AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../Vues/menuRMI.fxml"));
                Scene scene = new Scene(root); //redimmension auto
                //stage.initModality(Modality.APPLICATION_MODAL); //pour cacher la zone fenetre de windows
                //stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("Pendu");
                stage.setScene(scene);
                stage.setResizable(false);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
