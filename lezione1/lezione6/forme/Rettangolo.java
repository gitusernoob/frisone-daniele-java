package lezione6.forme;

public class Rettangolo extends Poligono {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    double area() {
        return base * altezza;
    }

    double perimetro() {
        return 2 * (base + altezza);
    }
}
