package lezioneLab_13_03.eserciziSlide.poligoni;

public class Rettangolo extends Poligoni{

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base*altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return base+base+altezza+altezza;
    }
}
