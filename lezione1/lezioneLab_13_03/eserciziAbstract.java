package lezioneLab_13_03;

public class eserciziAbstract {


    public static void main(String[] args) {

        //dichiaro un istanza di un oggetto di tipo quadrato q1
        Quadrato q1 = new Quadrato(5.0);
        //assegno all'oggetto q1 il valore 5.0 richiamando il metodo dell'istanza q1
        q1.setLato(5.0);
        System.out.println("l'area del quadrato è: " + q1.calcolaArea());
        System.out.println("perimetro del quadrato è: " + q1.calcolaPerimetro());


    }
}
