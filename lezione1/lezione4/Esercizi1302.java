package lezione4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Esercizi1302 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

/*
        //es1
        System.out.println("inserisci primo numero con la virgola: ");
        Double n1 = Double.parseDouble(scanner.nextLine());
        System.out.println("inserisci secondo numero con la virgola: ");
        Double n2 = Double.parseDouble(scanner.nextLine());
        System.out.println("la loro somma è : " + (n1+n2));


        //es2
        System.out.println("inserisci un numero, se è pari raddoppio se no dimezzo: ");
        Double n3 = Double.parseDouble(scanner.nextLine());
        if(n3%2 == 0){
            System.out.println(n3*2);
        } else {
            System.out.println(n3/2);
        }

        //es3
        int somma = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                somma += i;
            }
        }
        System.out.println(somma);


        //es4
        ArrayList<String> arrayNomi = new ArrayList<>();
        arrayNomi.add("filippo");
        arrayNomi.add("valeria");
        arrayNomi.add("valentina");
        arrayNomi.add("andrea");
        arrayNomi.add("enrico");
        arrayNomi.add("arman");
        arrayNomi.add("daniele");
        arrayNomi.add("oriundi");
        arrayNomi.add("daniele");
        arrayNomi.add("asdrubale");

        ArrayList<Integer> arrayIndici = new ArrayList<Integer>();
        for (int j = 0; j < arrayNomi.size(); j++) {
            if (arrayNomi.get(j).charAt(0) == 'a' ||
                    arrayNomi.get(j).charAt(0) == 'e' ||
                    arrayNomi.get(j).charAt(0) == 'i' ||
                    arrayNomi.get(j).charAt(0) == 'o' ||
                    arrayNomi.get(j).charAt(0) == 'u') {

                arrayNomi.remove(j);
                j--;
            }
        }

        System.out.println(arrayNomi);

        //es5

        List<Integer> arraynumeri = new ArrayList<>();
        arraynumeri.add(13);
        arraynumeri.add(14);
        arraynumeri.add(12);
        arraynumeri.add(13);
        arraynumeri.add(1444);
        arraynumeri.add(156);
        arraynumeri.add(13);
        arraynumeri.add(1334);
        arraynumeri.add(1223);
        arraynumeri.add(1673);
        arraynumeri.add(137);
        arraynumeri.add(1375);

        List<Integer> arrayDispari = new ArrayList<>();

        //arrayDispari= arraynumeri.stream().filter(n -> n%2 != 0).collect(Collectors.toList());

        for (int u = 0; u < arraynumeri.size(); u++){
            if (arraynumeri.get(u) %2 != 0){
                arrayDispari.add(arraynumeri.get(u));
            }
        }
        System.out.println(arrayDispari);

*/
        //es6

        Integer valore = -1;
        ArrayList<Integer> arrayEs6 = new ArrayList<>();
        while (valore != 4){
            System.out.println("1 = inserimento numero lista\n" +
                    "2 = rimozione numero lista\n" +
                    "3 = stampa lista\n" +
                    "4 = chiusura del programma.");

            valore = Integer.parseInt(scanner.nextLine());
            if (valore == 1){
                System.out.println("inserisci un valore da aggiungere all'array: ");
                Integer numero = Integer.parseInt(scanner.nextLine());
                arrayEs6.add(numero);
            } else if( valore == 2 ){
                System.out.println("inserisci un valore da rimuovere dall'array: ");
                Integer numero = Integer.parseInt(scanner.nextLine());
                for (int z = 0; z < arrayEs6.size(); z++){
                    if(arrayEs6.get(z).equals(numero)){
                        arrayEs6.remove(z);
                    }
                }
            } else if (valore == 3){
                System.out.println(arrayEs6);
            } else if(valore == 4){
                System.out.println("ciao ciao");
            }else {
                System.out.println("che minchia hai scritto");
            }

        }




    }
}
