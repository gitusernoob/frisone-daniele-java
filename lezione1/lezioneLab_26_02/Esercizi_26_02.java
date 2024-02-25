package lezioneLab_26_02;


import java.util.ArrayList;
import java.util.Scanner;

/**
 @author daniele frisone
 esercizi per il 26/02
 1) Scrivere una funzione che dati N numeri, dica se tutti questi N numeri sono pari;
 2) Scrivere una funzione che dati N numeri, dica se tutti questi N numeri sono dispari;
 3) Scrivere un programma che calcoli la somma della diagonale principale di una matrice;
 4) Controllare che all’interno di un array sia presente un determinato elemento e stamparne l’indice;
 5) Scrivere un programma che trovi il massimo ed il minimo di un elemento all’interno di un array.

 1b) Scrivere un programma che controlli se vi sono due righe all’interno di un array uguali.
 2b) Scrivere un programma che controlli se esiste una riga uguale all’interno di un array,
     identica alla riga di un altro array
 */

public class Esercizi_26_02 {

    public static void main(String[] args) {

        // 1) Scrivere una funzione che dati N numeri, dica se tutti questi N numeri sono pari;
        //verificaQuantiNumeriPari();

        // 2) Scrivere una funzione che dati N numeri, dica se tutti questi N numeri sono dispari;
        //verificaQuantiNumeriDispari();

        // 3) Scrivere un programma che calcoli la somma della diagonale principale di una matrice;
        sommaDiagonaleMatrice();

        // 4) Controllare che all’interno di un array sia presente un determinato elemento e stamparne l’indice;
        trovaElementoArray("paperino");

        //5) Scrivere un programma che trovi il massimo ed il minimo di un elemento all’interno di un array.
        int[] arrayN = new int[]{12, 13, -15, 5, 66, 126};
        trovaMaxMinArray(arrayN);

        //1b) Scrivere un programma che controlli se vi sono due righe all’interno di un array uguali.
        String[] arrayS = new String[]{"hello world", "pippo", "hello world", "hello world", "tizio", "pippo"};
        controllaRigheArrayUguali(arrayS);

        // 2b) Scrivere un programma che controlli se esiste una riga uguale all’interno di un array,
        //     identica alla riga di un altro array

        System.out.println("ULTIMO ESERCIZIO!!!");
        String[] arrayS2 = new String[]{"hello world", "pippo", "hello world", "hello world", "tizio", "pippo"};
        String[] arrayS3 = new String[]{"roar ", "pippo", " world", "roar", "tizio", "pippo", "pippo"};
        controllaRigheUgualiArrayDiversi(arrayS2, arrayS3);



    }

    public static void verificaQuantiNumeriPari(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci 5 numeri separati da spazio per vedere quanti sono pari");
        ArrayList<Integer> arrayNumeri = new ArrayList<>();
        arrayNumeri.add(Integer.parseInt(scanner.next()));
        arrayNumeri.add(Integer.parseInt(scanner.next()));
        arrayNumeri.add(Integer.parseInt(scanner.next()));
        arrayNumeri.add(Integer.parseInt(scanner.next()));
        arrayNumeri.add(Integer.parseInt(scanner.next()));

        int contatorePari = 0;
        for (Integer item : arrayNumeri){
            if(item %2 == 0){
                contatorePari++;
            }
        }
        System.out.println("il numero di elementi pari è " + contatorePari + " / " + arrayNumeri.size());
    }

    public static void verificaQuantiNumeriDispari(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci 5 numeri separati da spazio per vedere quanti sono dispari");
        ArrayList<Integer> arrayNumeri = new ArrayList<>();
        arrayNumeri.add(Integer.parseInt(scanner.next()));
        arrayNumeri.add(Integer.parseInt(scanner.next()));
        arrayNumeri.add(Integer.parseInt(scanner.next()));
        arrayNumeri.add(Integer.parseInt(scanner.next()));
        arrayNumeri.add(Integer.parseInt(scanner.next()));

        int contatoreDispari = 0;
        for (Integer item : arrayNumeri){
            if(item %2 != 0){
                contatoreDispari++;
            }
        }
        System.out.println("il numero di elementi dispari è " + contatoreDispari + " / " + arrayNumeri.size());
    }

    public static void sommaDiagonaleMatrice(){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        System.out.println("data questa matrice: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("la somma della diagonale è : ");
        Integer sommaDiagonale = 0;
        for (int i = 0; i<matrix.length; i++){
            sommaDiagonale += matrix[i][i];
        }
        System.out.println(sommaDiagonale);

    }

    public static void trovaElementoArray(String elemento){

        ArrayList<String> arrayStringhe = new ArrayList<>();
        arrayStringhe.add("tizio");
        arrayStringhe.add("caio");
        arrayStringhe.add("paperino");
        arrayStringhe.add("pluto");
        System.out.println("l'elemento '" + elemento + "' si trova alla posizione: ");
        System.out.println(arrayStringhe.indexOf(elemento));

    }

    public static void trovaMaxMinArray(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Il numero più piccolo dell'array è " + min + " .Il numero più grande è " + max);
    }

    public static void controllaRigheArrayUguali(String[] arrayS){

        ArrayList<Integer> indici = new  ArrayList<Integer>();
        for (int i = 0; i< arrayS.length; i++){
            for (int j = 0; j<arrayS.length; j++){
                if(arrayS[i].equals(arrayS[j]) && i!=j){
                    if(!indici.contains(i)){
                        System.out.println("la stringa '" + arrayS[i]+ "' è duplicata all' elemento " + j );
                        indici.add(j);
                    }
                }
            }
        }

    }

    public static void controllaRigheUgualiArrayDiversi(String[] arrayS2, String[] arrayS3){

        ArrayList<Integer> indici = new  ArrayList<Integer>();
        for (int i = 0; i< arrayS2.length; i++){
            for (int j = 0; j<arrayS3.length; j++){
                if(arrayS2[i].equals(arrayS3[j]) && i!=j){
                    System.out.println("la stringa '" + arrayS2[i]+ "' è duplicata all' elemento " + j
                            + " del secondo array" );
                }
            }
        }
    }


}
