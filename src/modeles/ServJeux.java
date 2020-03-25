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
}