package lezione3;

import java.util.Scanner;

public class Esercizi {

    public static void main(String[] args) {


        // es1) chiedere un num e dire pari o dispari


        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserisci un numero che ti dico se è pari");
        int num = Integer.parseInt(tastiera.nextLine());
        if (num %2 == 0){
            System.out.println("il numero è pari");
        } else {
            System.out.println("il numero è dispari");
        }


        // es2) chidere quante temp si vuole inserire. min max media

        System.out.println("inserisci un numero che indichi quante temp inserire");
        int nVolte = Integer.parseInt(tastiera.nextLine());
        int tempMin = 99999;
        int tempMax = -99999;
        int sommatemp = 0;

        for (int i = 0; i <nVolte; i++){
            System.out.println("inserisci temperatura");
            int temperatura = Integer.parseInt(tastiera.nextLine());
            if (temperatura < tempMin) tempMin = temperatura;
            if (temperatura > tempMax) tempMax = temperatura;
            sommatemp += temperatura;
        }
        System.out.println("la temperatura media è " + sommatemp/nVolte);
        System.out.println("la temperatura max è " + tempMax);
        System.out.println("la temperatura min è " + tempMin);


        // es3) (for arraylist) salvare le temp precedenti. stampare quelle maggiori di 10 gradi

        
        // es4) (while) chiede all utente dei numeri e sommarli finche non scrive 0 (termina inserisce 0)


        // es5) (string substring) stampare il proprio nome al contrario



    }

}
