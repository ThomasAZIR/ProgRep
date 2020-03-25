package controleur;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javafx.scene.layout.VBox;
import modeles.ServJeuxInterface;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import modeles.ServJeuxInterface;
public class allumettesControleur {

    @FXML
    Button btn_1;
    @FXML
    Button btn_2;
    @FXML
    Button btn_3;
    @FXML
    Label id_reste;
    @FXML
    Label id_display;
    @FXML
    Label id_nballumettes;
    @FXML
    MenuBar menu;

    public boolean victoire = false;

    int tas_allumettes = (int) (Math.random() * 50);

    int tour;

    public void findepartie(){
        btn_1.setDisable(true);
        btn_2.setDisable(true);
        btn_3.setDisable(true);
    }

    public void checkdutas(){
        if (tas_allumettes<=0 && tour == 0) {
            id_display.setText("Gagné !");
            findepartie();
        }
        else if (tas_allumettes<=0 && tour == 1) {
            id_display.setText("Perdu !");
            findepartie();
        }
        else if (tour == 0) tour_adverse();
    }

    public void tour_adverse(){
        tour = 1;
        int decision = 1 + (int) (Math.random() * 2);
        tas_allumettes -= decision;
        id_nballumettes.setText(Integer.toString(tas_allumettes));
        checkdutas();
    }

    public void initialize() throws RemoteException, MalformedURLException, NotBoundException{
       ServJeuxInterface obj = (ServJeuxInterface) Naming.lookup("rmi://127.0.0.1:8000/jeux");
       tour = 0;
       id_nballumettes.setText(Integer.toString(tas_allumettes));

    }
    public void un(ActionEvent event) throws RemoteException {
        tour = 0;
        tas_allumettes -= 1;
        id_nballumettes.setText(Integer.toString(tas_allumettes));
        checkdutas();
    }
    public void deux(ActionEvent event) throws RemoteException {
        tour = 0;
        tas_allumettes -= 2;
        id_nballumettes.setText(Integer.toString(tas_allumettes));
        checkdutas();

    }
    public void trois(ActionEvent event) throws RemoteException {
        tour = 0;
        tas_allumettes -= 3;
        id_nballumettes.setText(Integer.toString(tas_allumettes));
        checkdutas();

    }

    public void menu(ActionEvent evt) throws RemoteException {
        MenuItem menuCliqué = (MenuItem) evt.getTarget();
        String menuLabel = menuCliqué.getText();

        if ("Rejouer".equals(menuLabel)){
            //recup de la fenetre a l'aide d'un element
            Stage stageCourant = (Stage) id_display.getScene().getWindow();
            stageCourant.close();
            //lancement de la seconde fenetre
            try{
                Stage stage = new Stage();
                BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../Vues/allumettes.fxml"));
                Scene scene = new Scene(root); //redimmension auto
                //stage.initModality(Modality.APPLICATION_MODAL); //pour cacher la zone fenetre de windows
                //stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("Allumettes");
                stage.setScene(scene);
                stage.setResizable(false);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if ("Retour".equals(menuLabel)){
            //recup de la fenetre a l'aide d'un element
            Stage stageCourant = (Stage) id_display.getScene().getWindow();
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