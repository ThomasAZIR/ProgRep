package sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import modeles.ServJeuxInterface;

//Prog client
public class Client extends Application {

    public static ServJeuxInterface service;

    public static ServJeuxInterface getServJeuxInterface() {
        return service;
    }

    public static void setServJeuxInterface(ServJeuxInterface service, int port) {
        try {
            Client.service = (ServJeuxInterface) Naming.lookup("rmi://localhost:"+port+"/jeux");
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            System.out.println("Client erreur : " + e);
        }
    }

    private static final int port = 8000; //port en global
    @FXML
    private Button btnAllumettes;
    @FXML
    private Button btnPendu;
    @FXML
    private Button btnOthello;
    @FXML
    private Label lblTitre;
    @FXML
    private Label lblCredits;
    @FXML
    private Label lblInfos;
    @FXML
    private Label lblEtat;

    @Override
    public void start(final Stage primaryStage) {
        try {

            URL fxmlURL = getClass().getResource("../Vues/menuRMI.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
            Node root = fxmlLoader.load();
            Scene scene = new Scene((AnchorPane) root, 600, 400);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Serveur de jeu RMI");
            primaryStage.setResizable(false);
            primaryStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main (String[] args) throws RemoteException {
        try {
            setServJeuxInterface(service, port);
            launch(args); //lance la scene javafx

        } catch (Exception e) {
            System.out.println("ServJeux exception " + e);
        }
    }


    @FXML
    private void actionBtnPendu(ActionEvent event) {

        Stage menu = (Stage) btnPendu.getScene().getWindow();
        menu.close();


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
    @FXML
    private void actionBtnAllumettes(ActionEvent event) {

        Stage menu = (Stage) btnAllumettes.getScene().getWindow();
        menu.close();


        //lancement de la seconde fenetre

        try{
            Stage stage = new Stage();

            BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../Vues/allumettes.fxml"));
            Scene scene = new Scene(root); //redimmension auto
            stage.setTitle("Allumettes");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @FXML
    private void actionBtnOthello(ActionEvent event) {

        Stage menu = (Stage) btnOthello.getScene().getWindow();
        menu.close();


        //lancement de la seconde fenetre

        try{
            Stage stage = new Stage();
            Stage stage1 = new Stage();

            BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../Vues/othello.fxml"));
            BorderPane root1 = (BorderPane)FXMLLoader.load(getClass().getResource("../Vues/othello.fxml"));

            Scene scene = new Scene(root); //redimmension auto
            Scene scene1 = new Scene(root1); //redimmension auto

            stage.setTitle("Othello");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

            stage1.setTitle("Othello");
            stage1.setScene(scene1);
            stage1.setResizable(false);
            stage1.show();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}