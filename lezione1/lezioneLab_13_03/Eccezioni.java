package lezioneLab_13_03;

import java.util.Scanner;

public class Eccezioni {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("inserisci dividendo");
            double dividendo = Double.parseDouble(sc.nextLine());
            System.out.println("inserisci divisore");
            double divisore = Double.parseDouble(sc.nextLine());
            if(divisore == 0){
                throw new DivisionePerZeroException();
            }
            double risultato = dividendo/divisore;
            System.out.println(risultato);
        }catch (DivisionePerZeroException ex){
            System.out.println(ex.getMessage());
        }

    }
}
