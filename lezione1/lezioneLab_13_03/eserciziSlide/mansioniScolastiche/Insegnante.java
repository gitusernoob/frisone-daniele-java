package lezioneLab_13_03.eserciziSlide.mansioniScolastiche;

public class Insegnante extends Dipendente{


    public Insegnante(String mansioneScolastica) {
        super(mansioneScolastica);
    }

    @Override
    public void cosaFaAScuola() {
        System.out.println("questo dipendente fa " + getMansioneScolastica());
    }
}
