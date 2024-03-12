package lezione6.forme;

class Triangolo extends Poligono {
    private double lato1;
    private double lato2;
    private double lato3;

    private double altezza;
    private double base;

    public Triangolo(double lato1, double lato2, double lato3, double altezza) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.altezza = altezza;
        this.base = lato1;
    }

    double area() {
        return (base*altezza/2);
    }

    double perimetro() {
        return lato1 + lato2 + lato3;
    }
}

