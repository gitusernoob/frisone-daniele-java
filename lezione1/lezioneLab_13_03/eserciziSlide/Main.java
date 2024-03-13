package lezioneLab_13_03.eserciziSlide;

import lezioneLab_13_03.eserciziSlide.Animali.Leone;
import lezioneLab_13_03.eserciziSlide.Animali.Tigre;
import lezioneLab_13_03.eserciziSlide.Veicoli.Auto;
import lezioneLab_13_03.eserciziSlide.Veicoli.Moto;
import lezioneLab_13_03.eserciziSlide.mansioniScolastiche.Insegnante;
import lezioneLab_13_03.eserciziSlide.poligoni.Rettangolo;

public class Main {

    public static void main(String[] args) {

        Rettangolo r = new Rettangolo(10,20);
        System.out.println("area: " + r.calcolaArea() + " perimetro: " + r.calcolaPerimetro());

        Insegnante i = new Insegnante("professore matematica");
        i.cosaFaAScuola();

        Tigre t = new Tigre();
        t.sound();
        Leone l = new Leone();
        l.sound();

        Moto m = new Moto();
        m.startEngine();
        m.stopEngine();

        Auto a = new Auto();
        a.startEngine();
        a.stopEngine();

    }


}
