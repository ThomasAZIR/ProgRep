package modeles;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Case implements Serializable{

    public String statut;

    public Case() {
        this.statut = "vide";
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }




}
