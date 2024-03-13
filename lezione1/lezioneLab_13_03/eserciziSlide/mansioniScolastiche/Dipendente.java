package lezioneLab_13_03.eserciziSlide.mansioniScolastiche;

public abstract class Dipendente {

    String mansioneScolastica;

    public Dipendente(String mansioneScolastica) {

        this.mansioneScolastica = mansioneScolastica;
    }

    public String getMansioneScolastica() {
        return mansioneScolastica;
    }

    public void setMansioneScolastica(String mansioneScolastica) {
        this.mansioneScolastica = mansioneScolastica;
    }

    public abstract void cosaFaAScuola();

}
