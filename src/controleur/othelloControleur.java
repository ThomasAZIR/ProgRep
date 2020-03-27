package controleur;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import modeles.Case;
import modeles.ServJeuxInterface;


public class othelloControleur {

    @FXML
    private Pane pane00;
    @FXML
    private Circle cercle00;
    @FXML
    private Pane pane10;
    @FXML
    private Circle cercle10;
    @FXML
    private Pane pane20;
    @FXML
    private Circle cercle20;
    @FXML
    private Pane pane30;
    @FXML
    private Circle cercle30;
    @FXML
    private Pane pane40;
    @FXML
    private Circle cercle40;
    @FXML
    private Pane pane50;
    @FXML
    private Circle cercle50;
    @FXML
    private Pane pane60;
    @FXML
    private Circle cercle60;
    @FXML
    private Pane pane70;
    @FXML
    private Circle cercle70;
    @FXML
    private Pane pane01;
    @FXML
    private Circle cercle01;
    @FXML
    private Pane pane11;
    @FXML
    private Circle cercle11;
    @FXML
    private Pane pane21;
    @FXML
    private Circle cercle21;
    @FXML
    private Pane pane31;
    @FXML
    private Circle cercle31;
    @FXML
    private Pane pane41;
    @FXML
    private Circle cercle41;
    @FXML
    private Pane pane51;
    @FXML
    private Circle cercle51;
    @FXML
    private Pane pane61;
    @FXML
    private Circle cercle61;
    @FXML
    private Pane pane71;
    @FXML
    private Circle cercle71;
    @FXML
    private Pane pane02;
    @FXML
    private Circle cercle02;
    @FXML
    private Pane pane12;
    @FXML
    private Circle cercle12;
    @FXML
    private Pane pane22;
    @FXML
    private Circle cercle22;
    @FXML
    private Pane pane32;
    @FXML
    private Circle cercle32;
    @FXML
    private Pane pane42;
    @FXML
    private Circle cercle42;
    @FXML
    private Pane pane52;
    @FXML
    private Circle cercle52;
    @FXML
    private Pane pane62;
    @FXML
    private Circle cercle62;
    @FXML
    private Pane pane72;
    @FXML
    private Circle cercle72;
    @FXML
    private Pane pane03;
    @FXML
    private Circle cercle03;
    @FXML
    private Pane pane13;
    @FXML
    private Circle cercle13;
    @FXML
    private Pane pane23;
    @FXML
    private Circle cercle23;
    @FXML
    private Pane pane33;
    @FXML
    private Circle cercle33;
    @FXML
    private Pane pane43;
    @FXML
    private Circle cercle43;
    @FXML
    private Pane pane53;
    @FXML
    private Circle cercle53;
    @FXML
    private Pane pane63;
    @FXML
    private Circle cercle63;
    @FXML
    private Pane pane73;
    @FXML
    private Circle cercle73;
    @FXML
    private Pane pane04;
    @FXML
    private Circle cercle04;
    @FXML
    private Pane pane14;
    @FXML
    private Circle cercle14;
    @FXML
    private Pane pane24;
    @FXML
    private Circle cercle24;
    @FXML
    private Pane pane34;
    @FXML
    private Circle cercle34;
    @FXML
    private Pane pane44;
    @FXML
    private Circle cercle44;
    @FXML
    private Pane pane54;
    @FXML
    private Circle cercle54;
    @FXML
    private Pane pane64;
    @FXML
    private Circle cercle64;
    @FXML
    private Pane pane74;
    @FXML
    private Circle cercle74;
    @FXML
    private Pane pane05;
    @FXML
    private Circle cercle05;
    @FXML
    private Pane pane15;
    @FXML
    private Circle cercle15;
    @FXML
    private Pane pane25;
    @FXML
    private Circle cercle25;
    @FXML
    private Pane pane35;
    @FXML
    private Circle cercle35;
    @FXML
    private Pane pane45;
    @FXML
    private Circle cercle45;
    @FXML
    private Pane pane55;
    @FXML
    private Circle cercle55;
    @FXML
    private Pane pane65;
    @FXML
    private Circle cercle65;
    @FXML
    private Pane pane75;
    @FXML
    private Circle cercle75;
    @FXML
    private Pane pane06;
    @FXML
    private Circle cercle06;
    @FXML
    private Pane pane16;
    @FXML
    private Circle cercle16;
    @FXML
    private Pane pane26;
    @FXML
    private Circle cercle26;
    @FXML
    private Pane pane36;
    @FXML
    private Circle cercle36;
    @FXML
    private Pane pane46;
    @FXML
    private Circle cercle46;
    @FXML
    private Pane pane56;
    @FXML
    private Circle cercle56;
    @FXML
    private Pane pane66;
    @FXML
    private Circle cercle66;
    @FXML
    private Pane pane76;
    @FXML
    private Circle cercle76;
    @FXML
    private Pane pane07;
    @FXML
    private Circle cercle07;
    @FXML
    private Pane pane17;
    @FXML
    private Circle cercle17;
    @FXML
    private Pane pane27;
    @FXML
    private Circle cercle27;
    @FXML
    private Pane pane37;
    @FXML
    private Circle cercle37;
    @FXML
    private Pane pane47;
    @FXML
    private Circle cercle47;
    @FXML
    private Pane pane57;
    @FXML
    private Circle cercle57;
    @FXML
    private Pane pane67;
    @FXML
    private Circle cercle67;
    @FXML
    private Pane pane77;
    @FXML
    private Circle cercle77;
    @FXML
    private Button jouer;
    @FXML
    private Label txtnoir;
    @FXML
    private Label txtblanc;
    @FXML
    private Scene sceneMenu;
    @FXML
    private Label lbl_propend1;
    @FXML
    private Label lbl_propend2;
    @FXML
    private Button btn_quitter;

    ArrayList<ArrayList<Case>> plateaucase = new ArrayList<>();
    ArrayList<ArrayList<Circle>> plateaucercle = new ArrayList<>();

    int numjoueur = 0;
    int numautre = 0;

    String couleurj;
    String couleura;
    int N = 8;
    private boolean j1 = false;
    private boolean j2 = false;
    private int nbjoueur = 0;
    private int scorej1 = 0;
    private int scorej2 = 0;

    // /////////////////////////////////////////////////////////////////////////////////////////////
    public void initPlateau() throws RemoteException {
        int i;
        int j;
        for (i = 0; i < 8; i++) {
            plateaucase.add(new ArrayList<Case>());
        }
        /* On met tout a vide */
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                plateaucase.get(i).add(j, new Case());
            }
        }
        //On place les 4 premiers pions
        plateaucase.get(N / 2 - 1).get(N / 2 - 1).statut = "noir";
        plateaucase.get(N / 2).get(N / 2).statut = "noir";
        plateaucase.get(N / 2 - 1).get(N / 2).statut = "blanc";
        plateaucase.get(N / 2).get(N / 2 - 1).statut = "blanc";

    }

    public void reInitPlateau() throws RemoteException {
        int i;
        int j;
        /* On met tout a vide */
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                plateaucase.get(i).get(j).statut = "vide";
            }
        }
        //On place les 4 premiers pions
        plateaucase.get(N / 2 - 1).get(N / 2 - 1).statut = "noir";
        plateaucase.get(N / 2).get(N / 2).statut = "noir";
        plateaucase.get(N / 2 - 1).get(N / 2).statut = "blanc";
        plateaucase.get(N / 2).get(N / 2 - 1).statut = "blanc";

    }


    public ArrayList<ArrayList<Case>> donnerPlateau() throws RemoteException {
        return plateaucase;
    }

    /* Fonction pour verifier qu'une case existe */
    public boolean caseExiste(int lig, int col) throws RemoteException {
        return ((col >= 0) && (col < N) && (lig >= 0) && (lig < N));
    }

    /* Fonction pour verifier qu'un coup est valide */
    public boolean coupValide(int col, int lig, int numjoueur) throws RemoteException {
        int i;
        int j;
        boolean ok;
        String cj;
        String ca;

        /* On definit la couleur du joueur et celle de l'adversaire */
        if (numjoueur == 1) {
            cj = "noir";
            ca = "blanc";
        } else {
            cj = "blanc";
            ca = "noir";
        }
        if (!caseExiste(lig, col) || plateaucase.get(lig).get(col).statut != "vide") return false;

        /* Vertical vers le haut */
        i = lig - 1;
        ok = false;
        while (caseExiste(i, col) && plateaucase.get(i).get(col).statut.equalsIgnoreCase(ca)) {
            i--;
            ok = true;
        }
        if (caseExiste(i, col) && plateaucase.get(i).get(col).statut.equalsIgnoreCase(cj) && ok) return true;

        /* Vertical vers le bas */
        i = lig + 1;
        ok = false;
        while (caseExiste(i, col) && plateaucase.get(i).get(col).statut.equalsIgnoreCase(ca)) {
            i++;
            ok = true;
        }
        if (caseExiste(i, col) && plateaucase.get(i).get(col).statut.equalsIgnoreCase(cj) && ok) return true;

        /* Horizontal vers la gauche */
        j = col - 1;
        ok = false;
        while (caseExiste(lig, j) && plateaucase.get(lig).get(j).statut.equalsIgnoreCase(ca)) {
            j--;
            ok = true;
        }
        if (caseExiste(lig, j) && plateaucase.get(lig).get(j).statut.equalsIgnoreCase(cj) && ok) return true;

        /* Horizontal vers la droite */
        j = col + 1;
        ok = false;
        while (caseExiste(lig, j) && plateaucase.get(lig).get(j).statut.equalsIgnoreCase(ca)) {
            j++;
            ok = true;
        }
        if (caseExiste(lig, j) && plateaucase.get(lig).get(j).statut.equalsIgnoreCase(cj) && ok) return true;

        /* Diagonal \ vers le haut */
        i = lig - 1;
        j = col - 1;
        ok = false;
        while (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
            i--;
            j--;
            ok = true;
        }
        if (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(cj) && ok) return true;

        /* Diagonal \ vers le bas */
        i = lig + 1;
        j = col + 1;
        ok = false;
        while (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
            i++;
            j++;
            ok = true;
        }
        if (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(cj) && ok) return true;

        /* Diagonal / vers le haut */
        i = lig - 1;
        j = col + 1;
        ok = false;
        while (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
            i--;
            j++;
            ok = true;
        }
        if (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(cj) && ok) return true;

        /* Diagonal / vers le bas */
        i = lig + 1;
        j = col - 1;
        ok = false;
        while (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
            i++;
            j--;
            ok = true;
        }
        if (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(cj) && ok) return true;

        return false;
    }

    /* Fonction qui determine si un joueur peut encore jouer */
    public boolean peutJouer(int numjoueur) throws RemoteException {
        int i;
        int j;
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++)
                if (coupValide(i, j, numjoueur)) return true; /* Le joueur peut encore jouer */

        /* Le joueur ne peut plus jouer */
        return false;
    }

    /* Renvoie le numero du joueur suivant */
    public int joueurSuivant(int numjoueur) throws RemoteException {
        return (numjoueur % 2 + 1);
    }

    /* Permet au joueur de choisir un coup */


    public /* Verifie si la partie est terminee */
    boolean partieTerminee() throws RemoteException {
        int i, j, nb_noir, nb_blanc;

        /* On compte les pions noirs et les blancs */
        nb_noir = 0;
        nb_blanc = 0;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (plateaucase.get(i).get(j).statut.equalsIgnoreCase("vide") && (peutJouer(1) || peutJouer(2))) {
                    return false; /* La partie n'est pas finie */
                } else {
                    if (plateaucase.get(i).get(j).statut.equalsIgnoreCase("noir")) nb_noir++;
                    else if (plateaucase.get(i).get(j).statut.equalsIgnoreCase("blanc")) nb_blanc++;
                }
            }
        }

        scorej1 = nb_noir;
        scorej2 = nb_blanc;

        return true;
    }

    /* Fonction qui permet de jouer un coup */
    public void jouerCoup(int col, int lig, int numjoueur) throws RemoteException {
        int i, j;
        String cj, ca;

        if (numjoueur == 1) {
            cj = "noir";
            ca = "blanc";
        } else {
            cj = "blanc";
            ca = "noir";
        }
        plateaucase.get(lig).get(col).statut = cj;

        /* Vertical vers le haut */
        i = lig - 1;
        while (caseExiste(i, col) && plateaucase.get(i).get(col).statut.equalsIgnoreCase(ca)) i--;
        if (caseExiste(i, col) && plateaucase.get(i).get(col).statut.equalsIgnoreCase(cj)) {
            i = lig - 1;
            while (plateaucase.get(i).get(col).statut.equalsIgnoreCase(ca)) {
                plateaucase.get(i).get(col).statut = cj;
                i--;
            }
        }

        /* Vertical vers le bas */
        i = lig + 1;
        while (caseExiste(i, col) && plateaucase.get(i).get(col).statut.equalsIgnoreCase(ca)) i++;
        if (caseExiste(i, col) && plateaucase.get(i).get(col).statut.equalsIgnoreCase(cj)) {
            i = lig + 1;
            while (plateaucase.get(i).get(col).statut.equalsIgnoreCase(ca)) {
                plateaucase.get(i).get(col).statut = cj;
                i++;
            }
        }

        /* Horizontal vers la gauche */
        j = col - 1;
        while (caseExiste(lig, j) && plateaucase.get(lig).get(j).statut.equalsIgnoreCase(ca)) j--;
        if (caseExiste(lig, j) && plateaucase.get(lig).get(j).statut.equalsIgnoreCase(cj)) {
            j = col - 1;
            while (plateaucase.get(lig).get(j).statut.equalsIgnoreCase(ca)) {
                plateaucase.get(lig).get(j).statut = cj;
                j--;
            }
        }

        /* Horizontal vers la droite */
        j = col + 1;
        while (caseExiste(lig, j) && plateaucase.get(lig).get(j).statut.equalsIgnoreCase(ca)) j++;
        if (caseExiste(lig, j) && plateaucase.get(lig).get(j).statut.equalsIgnoreCase(cj)) {
            j = col + 1;
            while (plateaucase.get(lig).get(j).statut.equalsIgnoreCase(ca)) {
                plateaucase.get(lig).get(j).statut = cj;
                j++;
            }
        }

        /* Diagonal \ vers le haut */
        i = lig - 1;
        j = col - 1;
        while (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
            i--;
            j--;
        }
        if (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(cj)) {
            i = lig - 1;
            j = col - 1;
            while (plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
                plateaucase.get(i).get(j).statut = cj;
                i--;
                j--;
            }
        }

        /* Diagonal \ vers le bas */
        i = lig + 1;
        j = col + 1;
        while (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
            i++;
            j++;
        }
        if (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(cj)) {
            i = lig + 1;
            j = col + 1;
            while (plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
                plateaucase.get(i).get(j).statut = cj;
                i++;
                j++;
            }
        }

        /* Diagonal / vers le haut */
        i = lig - 1;
        j = col + 1;
        while (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
            i--;
            j++;
        }
        if (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(cj)) {
            i = lig - 1;
            j = col + 1;
            while (plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
                plateaucase.get(i).get(j).statut = cj;
                i--;
                j++;
            }
        }

        /* Diagonal \ vers le bas */
        i = lig + 1;
        j = col - 1;
        while (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
            i++;
            j--;
        }
        if (caseExiste(i, j) && plateaucase.get(i).get(j).statut.equalsIgnoreCase(cj)) {
            i = lig + 1;
            j = col - 1;
            while (plateaucase.get(i).get(j).statut.equalsIgnoreCase(ca)) {
                plateaucase.get(i).get(j).statut = cj;
                i++;
                j--;
            }
        }

        if ((numjoueur == 1) && peutJouer(2)) {
            j1 = false;
            j2 = true;
        } else if ((numjoueur == 2) && peutJouer(1)) {
            j1 = true;
            j2 = false;
        }
    }

    public void choisirCoup(int lig, int col, int numjoueur) throws RemoteException {

    }


    public int placejoueur() throws RemoteException, InterruptedException {
        if (nbjoueur == 2) nbjoueur = 0;
        nbjoueur++;
        if (nbjoueur == 1) j1 = true;
        return nbjoueur;
    }

    public boolean tourjoueur(int num) throws RemoteException {
        if ((num == 1) && (j1)) {
            return true;
        } else if ((num == 2) && (j2)) {
            return true;
        } else return false;
    }

    public int donnerscore(int numjoueur) throws RemoteException {
        if ((numjoueur == 1)) {
            return scorej1;
        } else if ((numjoueur == 2)) {
            return scorej2;
        } else return 0;
    }


    public void restart() throws RemoteException {
        scorej1 = 0;
        scorej2 = 0;
        j1 = false;
        j2 = false;
    }

    @FXML
    void commencer(MouseEvent event) {

    }

    @FXML
    void placerCercl12(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(2, 1, numjoueur)) {
                jouerCoup(2, 1, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle00(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(0, 0, numjoueur)) {
                jouerCoup(0, 0, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle01(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(1, 0, numjoueur)) {
                jouerCoup(1, 0, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle02(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(2, 0, numjoueur)) {
                jouerCoup(2, 0, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle03(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(3, 0, numjoueur)) {
                jouerCoup(3, 0, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle04(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(4, 0, numjoueur)) {
                jouerCoup(4, 0, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle05(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(5, 0, numjoueur)) {
                jouerCoup(5, 0, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle06(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(6, 0, numjoueur)) {
                jouerCoup(6, 0, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle07(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(7, 0, numjoueur)) {
                jouerCoup(7, 0, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle10(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(0, 1, numjoueur)) {
                jouerCoup(0, 1, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle11(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(1, 1, numjoueur)) {
                jouerCoup(1, 1, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle13(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(3, 1, numjoueur)) {
                jouerCoup(3, 1, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle14(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(4, 1, numjoueur)) {
                jouerCoup(4, 1, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle15(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(5, 1, numjoueur)) {
                jouerCoup(5, 1, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle16(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(6, 1, numjoueur)) {
                jouerCoup(6, 1, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle17(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(7, 1, numjoueur)) {
                jouerCoup(7, 1, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle20(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(0, 2, numjoueur)) {
                jouerCoup(0, 2, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle21(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(1, 2, numjoueur)) {
                jouerCoup(1, 2, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle22(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(2, 2, numjoueur)) {
                jouerCoup(2, 2, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle23(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(3, 2, numjoueur)) {
                jouerCoup(3, 2, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle24(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(4, 2, numjoueur)) {
                jouerCoup(4, 2, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle25(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(5, 2, numjoueur)) {
                jouerCoup(5, 2, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle26(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(6, 2, numjoueur)) {
                jouerCoup(6, 2, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle27(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(7, 2, numjoueur)) {
                jouerCoup(7, 2, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle30(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(0, 3, numjoueur)) {
                jouerCoup(0, 3, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle31(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(1, 3, numjoueur)) {
                jouerCoup(1, 3, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle32(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(2, 3, numjoueur)) {
                jouerCoup(2, 3, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle33(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(3, 3, numjoueur)) {
                jouerCoup(3, 3, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle34(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(4, 3, numjoueur)) {
                jouerCoup(4, 3, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle35(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(5, 3, numjoueur)) {
                jouerCoup(5, 3, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle36(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(6, 3, numjoueur)) {
                jouerCoup(6, 3, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle37(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(7, 3, numjoueur)) {
                jouerCoup(7, 3, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle40(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(0, 4, numjoueur)) {
                jouerCoup(0, 4, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle41(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(1, 4, numjoueur)) {
                jouerCoup(1, 4, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle42(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(2, 4, numjoueur)) {
                jouerCoup(2, 4, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle43(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(3, 4, numjoueur)) {
                jouerCoup(3, 4, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle44(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(4, 4, numjoueur)) {
                jouerCoup(4, 4, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle45(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(5, 4, numjoueur)) {
                jouerCoup(5, 4, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle46(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(6, 4, numjoueur)) {
                jouerCoup(6, 4, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle47(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(7, 4, numjoueur)) {
                jouerCoup(7, 4, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle50(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(0, 5, numjoueur)) {
                jouerCoup(0, 5, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle51(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(1, 5, numjoueur)) {
                jouerCoup(1, 5, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle52(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(2, 5, numjoueur)) {
                jouerCoup(2, 5, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle53(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(3, 5, numjoueur)) {
                jouerCoup(3, 5, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle54(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(4, 5, numjoueur)) {
                jouerCoup(4, 5, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle55(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(5, 5, numjoueur)) {
                jouerCoup(5, 5, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle56(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(6, 5, numjoueur)) {
                jouerCoup(6, 5, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle57(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(7, 5, numjoueur)) {
                jouerCoup(7, 5, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle60(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(0, 6, numjoueur)) {
                jouerCoup(0, 6, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle61(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(1, 6, numjoueur)) {
                jouerCoup(1, 6, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle62(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(2, 6, numjoueur)) {
                jouerCoup(2, 6, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle63(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(3, 6, numjoueur)) {
                jouerCoup(3, 6, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle64(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(4, 6, numjoueur)) {
                jouerCoup(4, 6, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle65(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(5, 6, numjoueur)) {
                jouerCoup(5, 6, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle66(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(6, 6, numjoueur)) {
                jouerCoup(6, 6, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle67(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(7, 6, numjoueur)) {
                jouerCoup(7, 6, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle70(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(0, 7, numjoueur)) {
                jouerCoup(0, 7, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle71(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(1, 7, numjoueur)) {
                jouerCoup(1, 7, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle72(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(2, 7, numjoueur)) {
                jouerCoup(2, 7, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle73(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(3, 7, numjoueur)) {
                jouerCoup(3, 7, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle74(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(4, 7, numjoueur)) {
                jouerCoup(4, 7, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle75(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(5, 7, numjoueur)) {
                jouerCoup(5, 7, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle76(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(6, 7, numjoueur)) {
                jouerCoup(6, 7, numjoueur);

            }
        }
    }

    @FXML
    void placerCercle77(MouseEvent event) throws RemoteException {
        if (tourjoueur(numjoueur)) {
            if (peutJouer(numjoueur) && coupValide(7, 7, numjoueur)) {
                jouerCoup(7, 7, numjoueur);

            }
        }
    }

    public void setMenuScene(Scene sceneMenu) {
        this.sceneMenu = sceneMenu;
    }

    void fin() throws RemoteException, InterruptedException {
        int sj = donnerscore(numjoueur);
        int sa = donnerscore(numautre);
        if (sj > sa)
            lbl_propend1.setText("Vous avez gagné !");
        else if (sa > sj)
            lbl_propend1.setText("Vous avez perdu !");
        else
            lbl_propend1.setText("Egalité !");
        lbl_propend2.setText("J1 : " + donnerscore(1) + "       J2 : " + donnerscore(2));
        btn_quitter.setVisible(true);
        lbl_propend1.setVisible(true);
        lbl_propend2.setVisible(true);
    }


    public void affichePlateau() throws RemoteException {
        ArrayList<ArrayList<Case>> plat = donnerPlateau();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //System.out.println("C " +i+" "+j+" = " + plat.get(i).get(j).statut);
                if (!(plat.get(i).get(j).statut.equalsIgnoreCase("vide"))) {
                    plateaucercle.get(i).get(j).setVisible(true);
                    if (plat.get(i).get(j).statut.equalsIgnoreCase("blanc"))
                        plateaucercle.get(i).get(j).setFill(Color.WHITE);
                    else
                        plateaucercle.get(i).get(j).setFill(Color.BLACK);
                } else plateaucercle.get(i).get(j).setVisible(false);
            }
        }

    }

    void getNumjoueur() throws RemoteException, InterruptedException {
        numjoueur = placejoueur();
        if (numjoueur == 1) {
            couleurj = "noir";
            couleura = "blanc";
            numautre = 2;
        } else {
            couleurj = "blanc";
            couleura = "noir";
            numautre = 1;
        }

    }

    @FXML
    public void initialize() throws RemoteException, MalformedURLException, NotBoundException, InterruptedException {
        getNumjoueur();
        for (int i = 0; i < 8; i++) {
            plateaucercle.add(new ArrayList<Circle>());
        }
        // ////////////////////////////////////////
        plateaucercle.get(0).add(0, cercle00);
        plateaucercle.get(0).add(1, cercle01);
        plateaucercle.get(0).add(2, cercle02);
        plateaucercle.get(0).add(3, cercle03);
        plateaucercle.get(0).add(4, cercle04);
        plateaucercle.get(0).add(5, cercle05);
        plateaucercle.get(0).add(6, cercle06);
        plateaucercle.get(0).add(7, cercle07);

        plateaucercle.get(1).add(0, cercle10);
        plateaucercle.get(1).add(1, cercle11);
        plateaucercle.get(1).add(2, cercle12);
        plateaucercle.get(1).add(3, cercle13);
        plateaucercle.get(1).add(4, cercle14);
        plateaucercle.get(1).add(5, cercle15);
        plateaucercle.get(1).add(6, cercle16);
        plateaucercle.get(1).add(7, cercle17);

        plateaucercle.get(2).add(0, cercle20);
        plateaucercle.get(2).add(1, cercle21);
        plateaucercle.get(2).add(2, cercle22);
        plateaucercle.get(2).add(3, cercle23);
        plateaucercle.get(2).add(4, cercle24);
        plateaucercle.get(2).add(5, cercle25);
        plateaucercle.get(2).add(6, cercle26);
        plateaucercle.get(2).add(7, cercle27);

        plateaucercle.get(3).add(0, cercle30);
        plateaucercle.get(3).add(1, cercle31);
        plateaucercle.get(3).add(2, cercle32);
        plateaucercle.get(3).add(3, cercle33);
        plateaucercle.get(3).add(4, cercle34);
        plateaucercle.get(3).add(5, cercle35);
        plateaucercle.get(3).add(6, cercle36);
        plateaucercle.get(3).add(7, cercle37);

        plateaucercle.get(4).add(0, cercle40);
        plateaucercle.get(4).add(1, cercle41);
        plateaucercle.get(4).add(2, cercle42);
        plateaucercle.get(4).add(3, cercle43);
        plateaucercle.get(4).add(4, cercle44);
        plateaucercle.get(4).add(5, cercle45);
        plateaucercle.get(4).add(6, cercle46);
        plateaucercle.get(4).add(7, cercle47);

        plateaucercle.get(5).add(0, cercle50);
        plateaucercle.get(5).add(1, cercle51);
        plateaucercle.get(5).add(2, cercle52);
        plateaucercle.get(5).add(3, cercle53);
        plateaucercle.get(5).add(4, cercle54);
        plateaucercle.get(5).add(5, cercle55);
        plateaucercle.get(5).add(6, cercle56);
        plateaucercle.get(5).add(7, cercle57);

        plateaucercle.get(6).add(0, cercle60);
        plateaucercle.get(6).add(1, cercle61);
        plateaucercle.get(6).add(2, cercle62);
        plateaucercle.get(6).add(3, cercle63);
        plateaucercle.get(6).add(4, cercle64);
        plateaucercle.get(6).add(5, cercle65);
        plateaucercle.get(6).add(6, cercle66);
        plateaucercle.get(6).add(7, cercle67);

        plateaucercle.get(7).add(0, cercle70);
        plateaucercle.get(7).add(1, cercle71);
        plateaucercle.get(7).add(2, cercle72);
        plateaucercle.get(7).add(3, cercle73);
        plateaucercle.get(7).add(4, cercle74);
        plateaucercle.get(7).add(5, cercle75);
        plateaucercle.get(7).add(6, cercle76);
        plateaucercle.get(7).add(7, cercle77);

        // /////////////////////////////////
        try {
            ServJeuxInterface obj = (ServJeuxInterface) Naming.lookup("rmi://127.0.0.1:8000/jeux");
            initPlateau();
            txtnoir.setVisible(true);
            lbl_propend1.setVisible(false);
            lbl_propend2.setVisible(false);
            btn_quitter.setVisible(false);

            Thread affichageThread = new Thread(() -> {
                while (true) {
                    try {
                        Thread.sleep(100); //1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Platform.runLater(() -> {
                        try {
                            affichePlateau();
                            if (tourjoueur(numjoueur))
                                txtnoir.setText("Vous etes \nle joueur " + numjoueur + "\n (" + couleurj + ")\n\n C'est votre tour !");
                            else
                                txtnoir.setText("Vous etes \nle joueur " + numjoueur + "\n (" + couleurj + ")\n\n C'est le tour du joueur " + numautre + " !");

                            if (partieTerminee()) fin();

                        } catch (RemoteException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    });
                }
            });
            affichageThread.start();


        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
        }


    }


    @FXML
    void quitter(MouseEvent event) throws RemoteException {
        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(sceneMenu);
        restart();
    }

    void rejouer(MouseEvent event) throws RemoteException {
        reInitPlateau();
    }

    void cacherFin() {
        lbl_propend1.setVisible(false);
        lbl_propend2.setVisible(false);
        btn_quitter.setVisible(false);
    }

    public void menuClic(ActionEvent evt) throws RemoteException {
        MenuItem menuClique = (MenuItem) evt.getTarget();
        String menuLabel = menuClique.getText();

        if ("Rejouer".equals(menuLabel)) {
            //recup de la fenetre a l'aide d'un element
            Stage stageCourant = (Stage) cercle00.getScene().getWindow();
            stageCourant.close();
            //lancement de la seconde fenetre
            try {
                Stage stage = new Stage();
                BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("../Vues/othello.fxml"));
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

        if ("Retour".equals(menuLabel)) {
            //recup de la fenetre a l'aide d'un element
            Stage stageCourant = (Stage) cercle00.getScene().getWindow();
            stageCourant.close();
            //lancement de la seconde fenetre
            try {
                Stage stage = new Stage();
                AnchorPane root = FXMLLoader.load(getClass().getResource("../Vues/menuRMI.fxml"));
                Scene scene = new Scene(root); //redimmension auto
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
