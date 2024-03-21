package lezioneLab_21_03;

import java.util.Scanner;

/**
 * @author Frisone Daniele
 * crea una funzione che calcoli la radice quadrata di un numero
 * verificare con un try & catch se il numero non sia negativo
 */

public class EsercizioTry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("metti un numero positivo o negativo, se negativo esce l'eccezione");
        radiceQuadrata( Double.parseDouble(sc.nextLine()));

    }

    static void radiceQuadrata(double numero)  {
        try {
            if(numero < 0){
                throw new NumeroNegativoException(NumeroNegativoException.EXC_MESSAGE);
            }
            System.out.println(Math.sqrt(numero));
        } catch (NumeroNegativoException e){
            System.out.println(e.getMessage());
        }
    }


}
