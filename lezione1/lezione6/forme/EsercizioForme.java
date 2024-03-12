package lezione6.forme;

import java.util.ArrayList;

public class EsercizioForme {

    public static void main(String[] args) {
        
        ArrayList<Poligono> arrayForme = new ArrayList<Poligono>();
        Triangolo triangolo = new Triangolo(2,2,3,2);
        arrayForme.add(triangolo);
        Quadrato quadrato = new Quadrato(2);
        arrayForme.add(quadrato);
        Rettangolo rettangolo = new Rettangolo(2,2);
        arrayForme.add(rettangolo);

        double sommaAree = 0.0;
        for (Poligono el : arrayForme){
            sommaAree+=el.area();
        }

        System.out.println(sommaAree);

    }
}
