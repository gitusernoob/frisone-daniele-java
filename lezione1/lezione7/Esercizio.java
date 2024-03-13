package lezione7;

public class Esercizio {

    //modellare la situazione
    //entita: Persona, Veicolo, (auto,moto,bici)
    //ogni persona può avere una patente
    //ogni persona può possedere n veicoli
    //solo chi ha la patente può avere auto e moto




    public static void main(String[] args) {
        PersonaEs p = new PersonaEs(true);
        Veicolo v = new Veicolo(Veicolo.TipoVeicolo.AUTO);
        p.aggiungiVeicolo(v);

        PersonaEs p2 = new PersonaEs(false);
        Veicolo v2 = new Veicolo(Veicolo.TipoVeicolo.AUTO);
        p2.aggiungiVeicolo(v2);

        Veicolo v3 = new Veicolo(Veicolo.TipoVeicolo.BICI);
        p2.aggiungiVeicolo(v3);
    }


}
