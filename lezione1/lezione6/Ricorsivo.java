package lezione6;

import java.util.ArrayList;

public class Ricorsivo {

    //count down ricorsivo

    public static void main(String[] args) {
       // countdown(10);
       // System.out.println(fattoriale(4));
       // System.out.println(fibonacci(8));
        //reverseString("java");
        System.out.println(rovesciaStringa("java"));

    }

    public static void countdown(int x){
        if (x>0){
            System.out.println(x);
            countdown(x-1);
        }
        else{
            System.out.println("Boom!"); //caso base -> viene definito il caso dove non viene richiamato il metodo
        }
    }


    public static int fattoriale(int x){
        //se x == 0 il fattoriale è 1
        //altrimenti è x * (x-1)!
        System.out.println("x = " + x);
        if(x>0){
            return x *= fattoriale(x-1);
        } else {
            System.out.println("fine");
            return 1;
        }
    }


    public static int fibonacci(int x){
        if (x == 0){
            return 0;
        } else if(x == 1){
            return 1;
        } else {
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }

//    Rovescia una stringa: Crea un metodo statico ricorsivo che inverte una stringa.
//    Il metodo dovrebbe prendere come parametro la stringa da invertire e restituire la stringa invertita.
//    Per esempio, se il metodo riceve "java", dovrebbe restituire "avaj".


    public static String rovesciaStringa(String x){
        if(x.length() < 2){
            return x;
        } else {
            String primaLettera = x.substring(0,1);
            return rovesciaStringa(x.substring(1)) + primaLettera;
        }
    }


   // Somma degli elementi di un array: Scrivi un metodo statico ricorsivo che calcola la somma degli elementi di un array di interi.
    // Il metodo dovrebbe prendere come parametri l'array e la sua lunghezza (o un indice che indica fino a quale punto dell'array calcolare la somma)
    // e restituire la somma totale degli elementi.

//    public static ArrayList<Integer> sommaArray(ArrayList<Integer> x, int indice){
//        if(indice == 1 )
//            return x[indice-1];
//        else {
//
//        }
//    }





}
