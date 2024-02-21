package lezioneLab2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author daniele frisone
 * una funzione calcolatrice
 * una funzione che trova il minore di tre numeri
 * una funzione che fa la media di tre numeri
 * una funzione che chiede la password è verifica che abbia 8 caratteri. solo numeri e lettere. almeno due lettere.
 */

public class Esercizi21_02 {

    public static void main(String[] args) {

        //calcolatrice();

        //minoreDiTreNumeri();

        //mediaDaTreNumeri();

        creaLaPassword();


    }


    static void calcolatrice() {
        // code to be executed

        Scanner scanner = new Scanner(System.in);
        Double risultato = 0.0;
        double numero1 = 0.0;
        double numero2 = 0.0;

        String ripeti = "y";
        while (ripeti.equals("y")) {

            System.out.println("inserisci il primo numero");
            numero1 = Double.parseDouble(scanner.nextLine());

            System.out.println("inserisci il tipo operazione (+,-,*,/,seno,coseno,tangente,divisibile)");
            String operazione = scanner.nextLine();

            if (!operazione.equals("seno") && !operazione.equals("coseno") && !operazione.equals("tangente")) {
                //se non è un operazione trigonometrica serve il secondo numero
                System.out.println("inserisci il secondo numero");
                numero2 = Double.parseDouble(scanner.nextLine());

            } else {

                if (operazione.equals("seno")) {
                    System.out.println(Math.sin(Math.toRadians(numero1)));
                }
                if (operazione.equals("coseno")) {
                    System.out.println(Math.cos(Math.toRadians(numero1)));
                }
                if (operazione.equals("tangente")) {
                    System.out.println(Math.tan(Math.toRadians(numero1)));
                }
            }


            if (operazione.equals("+")) {
                //risultato = numero1 + numero2;
                System.out.println(somma(numero1, numero2));
            }
            if (operazione.equals("-")) {
                risultato = numero1 - numero2;
                System.out.println(risultato);
            }
            if (operazione.equals("*")) {
                risultato = numero1 * numero2;
                System.out.println(risultato);
            }
            if (operazione.equals("/") && numero2 != 0) {
                risultato = numero1 / numero2;
                System.out.println(risultato);
            } else if (numero2 == 0 && operazione.equals("/")) {
                int divisore = 0;
                while (divisore == 0) {
                    System.out.println("inserisci un altro numero come divisore");
                    divisore = Integer.parseInt(scanner.nextLine());
                }
                risultato = numero1 / divisore;
                System.out.println(risultato);

            }
            if (operazione.equals("divisibile")) {
                if (numero1 % numero2 == 0) {
                    System.out.println("il numero " + numero1 + " è divisibile per " + numero2);
                } else {
                    System.out.println("il numero " + numero1 + " NON è divisibile per " + numero2);
                }
            }

            System.out.println("scrivi 'y' se vuoi ripetere il programma: ");
            ripeti = scanner.nextLine();

        } //fine while

    } // fine funzione calcolatrice


    static Double somma(double a, double b) {
        return a + b;
    }

    static void minoreDiTreNumeri() {

        System.out.println("inserisci 3 numeri separati da spazio ");
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.next());
        int n2 = Integer.parseInt(scanner.next());
        int n3 = Integer.parseInt(scanner.next());

        if (n1 < n2 && n1 < n3) {
            System.out.println("il numero più piccolo è " + n1);
        }
        if (n2 < n1 && n2 < n3) {
            System.out.println("il numero più piccolo è " + n2);
        }
        if (n3 < n1 && n3 < n2) {
            System.out.println("il numero più piccolo è " + n3);
        }

    }

    static void mediaDaTreNumeri() {
        System.out.println("inserisci 3 numeri separati da spazio ");
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.next());
        int n2 = Integer.parseInt(scanner.next());
        int n3 = Integer.parseInt(scanner.next());
        System.out.println("la media è " + (n1 + n2 + n3) / 3);
    }


    static void  creaLaPassword(){

        boolean continua = true;

        while(continua){
            System.out.println("inserisci una password contenente almeno 8 caratteri e 2 numeri. non usare altro se non lettere o numeri");
            Scanner scanner = new Scanner(System.in);
            int contatoreLettere = 0;
            int contatatoreNumeri = 0;

            char[] password = scanner.nextLine().toCharArray();
            if (password.length < 8){
                System.out.println("la password è troppo corta, inserisci una password valida");
            }


            for (int i = 0; i < password.length; i++){
                if(Character.isLetter(password[i])){
                    contatoreLettere++;
                }
                if(Character.isDigit(password[i])){
                    contatatoreNumeri++;
                }
            }

            if (contatatoreNumeri + contatoreLettere < password.length){
                System.out.println("la password ha dei caratteri non validi");
            } else if(contatatoreNumeri<2) {
                System.out.println("la password non ha due numeri dentro");
            } else {
                System.out.println("la password è valida! :-) ");
                continua = false;
            }
        }


    }

}
