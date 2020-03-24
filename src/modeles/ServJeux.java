package modeles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.Random;
import modeles.Caractere;

//Implémentation
public class ServJeux extends UnicastRemoteObject implements ServJeuxInterface {

    public ServJeux () throws RemoteException {
        super();
        this.demarrerMorpion();
    }
    public String echo () throws RemoteException {
        return "#ECHO";
    }
    /////////////////////////////////////////////////////////////////	MORPION
    private final int TAILLE = 3;
    private boolean finMorpion;
    private Caractere[][] grille;
    private Caractere caractSuivant;


    @Override
    public void demarrerMorpion() throws RemoteException {
        this.grille = new Caractere[this.TAILLE][this.TAILLE];
        this.caractSuivant = Caractere.X;
        this.finMorpion = false;
    }

    @Override
    public void redemarrerMorpion() throws RemoteException {
        this.demarrerMorpion();
    }

    @Override
    public Caractere[][] getGrille() throws RemoteException {
        return this.grille;
    }

    @Override
    public Caractere setCaract(int x, int y) throws RemoteException {
        if(!this.finMorpion) {
            System.out.println("Un place un caractère en ("+x+","+y+")");
            if(this.grille[x][y] == null) {
                this.grille[x][y] = this.caractSuivant;

                Caractere caractSelectionne = this.caractSuivant;

                this.caractSuivant = this.caractSuivant.equals(Caractere.X) ? Caractere.O : Caractere.X;

                return caractSelectionne;
            }
        }
        return null;
    }

    @Override
    public boolean finMorpion() throws RemoteException {
        Caractere caract = null;
        this.finMorpion = true;

        System.out.println("Test - Ligne");
        verifLigne:
        for(int i = 0; i < this.TAILLE; i++) {
            caract = this.grille[i][0];
            if(caract == null) {
                continue;
            }

            for(int j = 1; j < this.TAILLE; j++) {
                if(!caract.equals(this.grille[i][j])) {
                    continue verifLigne;
                }
            }
            System.out.println("Test - Ligne - OK");
            return true;
        }

        System.out.println("Test - Colonne");
        verifColonne:
        for(int i = 0; i < this.TAILLE; i++) {
            caract = this.grille[0][i];
            if(caract == null) {
                continue;
            }

            for(int j = 1; j < this.TAILLE; j++) {
                if(!caract.equals(this.grille[j][i])) {
                    continue verifColonne;
                }
            }
            System.out.println("Test - Colonne - OK");
            return true;
        }

        System.out.println("Test - Diagonale 1 (0,0 à 2,2)");
        boolean a = true;
        caract = this.grille[0][0];
        if(caract != null) {
            for(int i = 1; i < this.TAILLE; i++) {
                if(!caract.equals(this.grille[i][i])) {
                    a = false;
                    break;
                }
            }
            if(a) {
                System.out.println("Test - Diagonale 1 (0,0 à 2,2) - OK");
                return true;
            }
        }

        System.out.println("Test - Diagonale 2 (0,2 à 2,0)");
        boolean b = true;
        caract = this.grille[0][2];
        if(caract != null) {
            for(int i = 1; i < this.TAILLE; i++) {
                //System.out.println(caract + "=" + this.grille[i][this.TAILLE - 1 - i]);
                if(!caract.equals(this.grille[i][this.TAILLE - 1 - i])) {
                    b = false;
                    break;
                }
            }
            if(b) {
                System.out.println("Test - Diagonale 2 (0,2 à 2,0) - OK");
                return true;
            }
        }




        this.finMorpion = false;
        return false;
    }

    @Override
    public String getGagnant() throws RemoteException {
        //System.out.println(this.finMorpion);
        if(this.finMorpion) {

            if (this.caractSuivant.equals(Caractere.X))
                return "- Le joueur 2 a gagné :)";
            else if (this.caractSuivant.equals(Caractere.O))
                return "- Le joueur 1 a gagné :)";

            //return this.caractSuivant.equals(Caractere.X) ? Caractere.O : Caractere.X;
        }
        return null;
    }

/////////////////////////////////////////////////////////////////	PENDU

    @Override
    public String motPendu() throws RemoteException {
        String cmot="";

        String fichier ="fichier.txt";
        int compteur =0;
        Random randomGenerator = new Random();
        int limite = randomGenerator.nextInt(18);
        System.out.println(limite+"\n");
        //lecture du fichier texte
        try{
            InputStream ips=new FileInputStream(fichier);
            InputStreamReader ipsr=new InputStreamReader(ips);
            BufferedReader br=new BufferedReader(ipsr);
            String ligne;
            while ((ligne=br.readLine())!=null && compteur<limite){
                cmot = ligne;
                compteur++;
            }
            br.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        return cmot;
    }



    /////////////////////////////////////////////////////////////////	TAQUIN
    ArrayList gTaquin = new ArrayList();
    ArrayList gTest = new ArrayList();

    public ArrayList initGrille(){
        gTaquin.add("1");
        gTaquin.add("2");
        gTaquin.add("3");
        gTaquin.add("4");
        gTaquin.add("5");
        gTaquin.add("6");
        gTaquin.add("7");
        gTaquin.add("");
        gTaquin.add("8");

        return gTaquin;
    }

    public boolean testVictoire(ArrayList grille){
        boolean test = false;
        gTest.add("1");
        gTest.add("2");
        gTest.add("3");
        gTest.add("4");
        gTest.add("5");
        gTest.add("6");
        gTest.add("7");
        gTest.add("8");
        gTest.add("");
        if(grille == gTest)
        {
            test = true;
            return test;
        }
        else
        {
            return test;
        }
    }

    public ArrayList clicCase(String b, ArrayList gTaquin){
        System.out.println(b + " b");
        int positionVide = 0;
        int positionClic = 0;


        for(int i = 0 ; i < gTaquin.size() ; i++ ){
            if(gTaquin.get(i).equals("")){
                positionVide = i;
            }
            if(gTaquin.get(i).toString() == b){
                positionClic = i;
            }
        }

        if(b.equals("1") && (positionVide == 2 || positionVide == 4)){
            System.out.println(b + " ok3");
            System.out.println(positionVide + " positionVide");
            System.out.println(positionClic + " positionClic");
            gTaquin.set(positionVide, positionClic);
            gTaquin.set(positionClic, "");
        }
        else if(b.equals("2") && (positionVide == 1 || positionVide == 3 || positionVide == 5)){
            System.out.println(positionVide + " positionVide");
            System.out.println(positionClic + " positionClic");
            gTaquin.set(positionVide, positionClic);
            gTaquin.set(positionClic, "");
        }
        else  if(b.equals("3") && (positionVide == 2 || positionVide == 6)){
            System.out.println(positionVide + " positionVide");
            System.out.println(positionClic + " positionClic");
            gTaquin.set(positionVide, positionClic);
            gTaquin.set(positionClic, "");
        }
        else if(b.equals("4") && (positionVide == 1 || positionVide == 5 || positionVide == 7)){
            System.out.println(positionVide + " positionVide");
            System.out.println(positionClic + " positionClic");
            gTaquin.set(positionVide, positionClic);
            gTaquin.set(positionClic, "");
        }
        else if(b.equals("5") && (positionVide == 2 || positionVide == 4 || positionVide == 6 || positionVide == 8)){
            System.out.println(positionVide + " positionVide");
            System.out.println(positionClic + " positionClic");
            gTaquin.set(positionVide, positionClic);
            gTaquin.set(positionClic, "");
        }
        else if(b.equals("6") && (positionVide == 3 || positionVide == 5 || positionVide == 9)){
            System.out.println(positionVide + " positionVide");
            System.out.println(positionClic + " positionClic");
            gTaquin.set(positionVide, positionClic);
            gTaquin.set(positionClic, "");
        }
        else if (b.equals("7") && (positionVide == 4 || positionVide == 8)){
            System.out.println(positionVide + " positionVide");
            System.out.println(positionClic + " positionClic");
            gTaquin.set(positionVide, positionClic);
            gTaquin.set(positionClic, "");
        }
        else if(b.equals("8") && (positionVide == 7 || positionVide == 5 || positionVide == 9)){
            System.out.println(positionVide + " positionVide");
            System.out.println(positionClic + " positionClic");
            gTaquin.set(positionVide, positionClic);
            gTaquin.set(positionClic, "");

        }
        else if(b.equals("9") && (positionVide == 6 || positionVide == 8)){
            System.out.println(positionVide + " positionVide");
            System.out.println(positionClic + " positionClic");
            gTaquin.set(positionVide, positionClic);
            gTaquin.set(positionClic, "");
        }
        System.out.println(gTaquin.toString());
        return gTaquin;

    }




}