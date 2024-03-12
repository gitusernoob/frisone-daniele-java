package lezione6.forme;

class Quadrato extends Poligono {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    double area() {
        return lato * lato;
    }

    double perimetro() {
        return 4 * lato;
    }
}
