package lezione7;

import java.util.ArrayList;

public class PersonaEs {

    boolean patente;
    ArrayList<Veicolo> arrayVeicoli;

    public PersonaEs(boolean patente){
        this.patente = patente;
    }

    public void aggiungiVeicolo(Veicolo v){
        if(this.patente){
            arrayVeicoli.add(v);
        }else {
            System.out.println("non ha la patente");
        }
    }

}
