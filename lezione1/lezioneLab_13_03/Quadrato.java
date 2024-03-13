package lezioneLab_13_03;

import lezioneLab_13_03.interfaces.IMisurePoligoni;

public class Quadrato implements IMisurePoligoni {


    private double lato;

    public Quadrato(Double lato){
        this.lato = lato;
    }

    @Override
    public Double calcolaPerimetro() {
        return this.lato*4;
    }

    @Override
    public Double calcolaArea() {
        return Math.pow(this.lato,2);
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }
}
