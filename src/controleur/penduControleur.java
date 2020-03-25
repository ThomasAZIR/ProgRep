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

public class penduControleur {

    @FXML
    MenuBar menu;

    @FXML
    TextField id_proposition;

    @FXML
    Label id_used;

    @FXML
    Label id_nessais;

    @FXML
    Label id_mot;

    @FXML
    Label id_ninja;

    int nessais;
    int nlettrescachees;
    String lettresutilisees;
    String motatrouver;
    String motcache;
    public ArrayList<String> mots = new ArrayList<>(){{
        add("ORDINATEUR");
        add("CORONAVIRUS");
        add("JAVA");
        add("DOOM");
        add("PRISON");
        add("CONFINEMENT");
        add("PROJET");
        add("NINTENDO");
        add("LINKEDIN");
        add("PROFESSEUR");
        add("ENNUI");
        add("STAGIAIRE");
    }};

    public String motAleatoire (ArrayList<String> listeNombre)  {
        return listeNombre.get( (int) (Math.random()*listeNombre.size()));
    }

    public String cacher(String mot){
        String res="";
        for (int i = 0; i< mot.length();i++){
            res+="*";
        }
        return res;
    }

    public void finpartie(){
        id_proposition.setDisable(true);
    }

    public void checketat(){
        if (nessais > 0 && nlettrescachees == 0){
            id_nessais.setText("Bravo, vous avez gagné !");
            finpartie();
        }
        else if (nessais == 0){
            id_nessais.setText("Dommage, vous avez perdu !");
            finpartie();
        }
    }
    public void checkLettre() {
        String lettre = id_proposition.getText();
        String mot = id_ninja.getText();
        int ind;
        boolean check = false;
        id_proposition.clear();
        if (lettre.length() != 1) id_nessais.setText("Entrez une lettre !");
        else {
            id_nessais.setText("Il vous reste " + Integer.toString(nessais) + " essais !"); // on reset le label si jamais il y avait une erreur avant
            lettresutilisees += lettre + " ";
            id_used.setText(lettresutilisees);

            for (int i = 0; i < motatrouver.length(); i++) {
                if (lettre.toUpperCase().equals(String.valueOf(motatrouver.charAt(i)))) {// un peu moche mais apparemment je ne peux pas caster un char en String
                    check = true;
                    ind = i;
                    // /////
                    char[] test = motcache.toCharArray();
                    test[ind] = lettre.charAt(0);
                    motcache = new String(test);
                    id_mot.setText(motcache.toUpperCase());
                    nlettrescachees -=1;
                }

            }
            // à partir de là on sait si la lettre est dans le mot ou pas, et où
            if (! check) {
                nessais -=1;
                id_nessais.setText("Il vous reste " + Integer.toString(nessais) + " essais !");
            }
            checketat();
        }
    }
    public void initialize() throws RemoteException, MalformedURLException, NotBoundException{

        ServJeuxInterface obj = (ServJeuxInterface) Naming.lookup("rmi://127.0.0.1:8000/jeux");
        nessais=6;

        lettresutilisees="";
        id_used.setText("");

        motatrouver = motAleatoire(mots);
        nlettrescachees = motatrouver.length();
        motcache = cacher(motatrouver);
        id_ninja.setText(motatrouver);
        id_mot.setText(motcache);


    }

    //Initialisation menu
    public void menuClic(ActionEvent evt) throws RemoteException {
        MenuItem menuClique = (MenuItem) evt.getTarget();
        String menuLabel = menuClique.getText();

        if ("Rejouer".equals(menuLabel)){
            //recup de la fenetre a l'aide d'un element
            Stage stageCourant = (Stage) id_mot.getScene().getWindow();
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
            Stage stageCourant = (Stage) id_mot.getScene().getWindow();
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
