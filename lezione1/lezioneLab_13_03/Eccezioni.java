package lezioneLab_13_03;

import java.util.Scanner;

public class Eccezioni {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try {
            double dividendo = Double.parseDouble(sc.nextLine());
            double divisore = Double.parseDouble(sc.nextLine());
            if(divisore == 0){
                throw new Exception("divisione per zero, errore");
            }
            double risultato = dividendo/divisore;
            System.out.println(risultato);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
