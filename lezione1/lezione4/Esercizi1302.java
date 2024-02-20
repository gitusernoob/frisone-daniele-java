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


        //es6

        Integer valore = -1;
        ArrayList<Integer> arrayEs6 = new ArrayList<>();
        while (valore != 4) {
            System.out.println("1 = inserimento numero lista\n" +
                    "2 = rimozione numero lista\n" +
                    "3 = stampa lista\n" +
                    "4 = chiusura del programma.");

            valore = Integer.parseInt(scanner.nextLine());
            if (valore == 1) {
                System.out.println("inserisci un valore da aggiungere all'array: ");
                Integer numero = Integer.parseInt(scanner.nextLine());
                arrayEs6.add(numero);
            } else if (valore == 2) {
                System.out.println("inserisci un valore da rimuovere dall'array: ");
                Integer numero = Integer.parseInt(scanner.nextLine());
                for (int z = 0; z < arrayEs6.size(); z++) {
                    if (arrayEs6.get(z).equals(numero)) {
                        arrayEs6.remove(z);
                    }
                }
            } else if (valore == 3) {
                System.out.println(arrayEs6);
            } else if (valore == 4) {
                System.out.println("ciao ciao");
            } else {
                System.out.println("che minchia hai scritto");
            }

        }
*/

//      Esercizio 1 crea un metodo min che prende come parametri int x e y e restituisce il minimo
//      (per testarlo: System.out.println(min(1,2)); deve stampare 1

        System.out.println(min(1, 2)); // should print 1

//       Esercizio 2 crea un metodo contrario che prende un nome n e restituisce il nome al contrario (guardare codice su github vecchio)
//       per testarlo: System.out.println(contrario("Filippo")) deve stampare oppiliF

        System.out.println(contrario("Filippo"));

//       Esercizio 3 crea un metodo range che prende come parametro un numero n e restituisce una nuova List
//       con i numeri da 0 a n-1

        int n = 5;
        List<Integer> numbers = range(n);
        System.out.println(numbers);

//       Esercizio 4 crea un metodo stampa che accetta una List<Integer> e stampa la lista di interi nel seguente modo:
//       Lista [ n1 n2 n3 n4 n5]"

        List<Integer> lista = List.of(1, 2, 3, 4, 5);
        stampa(lista);
    }

    public static int min(int x, int y) {
        return Math.min(x, y);
    }

    public static String contrario(String nome) {
        String nomeInverso = "";
        for (int i = nome.length() - 1; i >= 0; i--) {
            nomeInverso += nome.charAt(i);
        }
        return nomeInverso;
    }

    public static List<Integer> range(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(i);
        }
        return result;
    }

    public static void stampa(List<Integer> lista) {
        System.out.print("Lista [ ");
        for (Integer num : lista) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
