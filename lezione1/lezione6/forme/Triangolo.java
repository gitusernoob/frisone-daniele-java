package lezione6.forme;

public class Triangolo extends  Poligoni{

    public Triangolo(Double base, Double altezza, Double lato1, Double lato2, Double lato3) {
        super((base*altezza)/2, (lato1+lato2+lato3));
    }
}
