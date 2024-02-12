package lezione3;

import java.util.ArrayList;
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
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i <nVolte; i++){
            System.out.println("inserisci temperatura");
            int temperatura = Integer.parseInt(tastiera.nextLine());
            if (temperatura < tempMin) tempMin = temperatura;
            if (temperatura > tempMax) tempMax = temperatura;
            sommatemp += temperatura;
            array.add(temperatura);
        }
        System.out.println("la temperatura media è " + sommatemp/nVolte);
        System.out.println("la temperatura max è " + tempMax);
        System.out.println("la temperatura min è " + tempMin);


        // es3) (for arraylist) salvare le temp precedenti. stampare quelle maggiori di 10 gradi
        System.out.println("le temperature maggiori di 10 sono: ");
        for (int i = 0; i< array.size(); i++){
            if (array.get(i)>=10){
                System.out.println(array.get(i));
            }
        }
        
        // es4) (while) chiede all utente dei numeri e sommarli finche non scrive 0 (termina inserisce 0)
        System.out.println("scrivi 0 per terminare il nuovo inserimento di numeri. il while li somma: ");
        int somma = -1;
        int numeroDaSommare = -1;
        int c = 0;
        while (numeroDaSommare != 0){

            if(c==0){
                numeroDaSommare=0;
                c=1;
                System.out.println("ho azzerato numero da sommare");
            }
            numeroDaSommare = Integer.parseInt(tastiera.nextLine());
            somma += numeroDaSommare;
            System.out.println("il tot per adesso è : " + somma);
            if(numeroDaSommare == 0){
                System.out.println("esco dal programma");
            }
        }


        // es5) (string substring) stampare il proprio nome al contrario

        System.out.println("inserisci il tuo nome");
        String stringa =  tastiera.nextLine();
        char[] stringaInvertita = stringa.toCharArray();
        int c1 = 0;
        for (int i = stringa.length() - 1; i >= 0; i--) {
            stringaInvertita[c] =stringa.charAt(i);
            c1++;
        }
        System.out.println(stringaInvertita);



    }



}
