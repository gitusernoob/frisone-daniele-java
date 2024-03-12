package lezione6.forme;

class Quadrato extends Poligono {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    public double area() {
        return lato * lato;
    }


    @Override
    public double perimetro() {
        return 4 * lato;
    }
}
