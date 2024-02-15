package lezioneLab1;


import java.util.Objects;
import java.util.Scanner;

/**
    @author daniele frisone
    calcolatrice
    classe che implementa il primo esercizio che si occupa di creare una calcolatrice classica
    ovvero una calcolatrice che implementa le 4 operazioni fondamentali
 */
public class esercizi1502 {

    public static void main(String[] args) {

        calcolatrice();

//        ESEMPIO SWITCH CASE
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("inserisci 1 per la somma, 2 per la sottrazione");
//        int operatore = Integer.parseInt(scanner.nextLine());
//
//        switch(operatore){
//            case 1:
//                System.out.println("inserisci il primo numero");
//                double primoAddendo = Double.parseDouble(scanner.nextLine());
//                System.out.println("inserisci il secondo numero");
//                double secondoAddendo = Double.parseDouble(scanner.nextLine());
//                System.out.println("la somma è: ");
//                System.out.println(primoAddendo+secondoAddendo);
//                break;
//            case 2:
//                break;
//            default:
//                System.out.println("scegli tra le opzioni 1 e 2");
//                break;
//        }

    } //end main


    static void calcolatrice() {
        // code to be executed

        Scanner scanner = new Scanner(System.in);
        Double risultato = 0.0;
        double numero1 = 0.0;
        double numero2 = 0.0;

        String ripeti = "y";
        while (ripeti.equals("y")){

            System.out.println("inserisci il primo numero");
            numero1 = Double.parseDouble( scanner.nextLine());

            System.out.println("inserisci il tipo operazione (+,-,*,/,seno,coseno,tangente,divisibile)");
            String operazione = scanner.nextLine();

            if(!operazione.equals("seno") && !operazione.equals("coseno") && !operazione.equals("tangente")){
                //se non è un operazione trigonometrica serve il secondo numero
                System.out.println("inserisci il secondo numero");
                numero2 = Double.parseDouble( scanner.nextLine());

            }   else {

                if(operazione.equals("seno")){
                    System.out.println(Math.sin(Math.toRadians(numero1)));
                }
                if(operazione.equals("coseno")){
                    System.out.println(Math.cos(Math.toRadians(numero1)));
                }
                if(operazione.equals("tangente")){
                    System.out.println(Math.tan(Math.toRadians(numero1)));
                }
            }


            if(operazione.equals("+")){
                //risultato = numero1 + numero2;
                System.out.println(somma(numero1,numero2));
            }
            if(operazione.equals("-")){
                risultato = numero1 - numero2;
                System.out.println(risultato);
            }
            if(operazione.equals("*")){
                risultato = numero1 * numero2;
                System.out.println(risultato);
            }
            if(operazione.equals("/") && numero2 != 0){
                risultato = numero1 / numero2;
                System.out.println(risultato);
            } else if(numero2 == 0 && operazione.equals("/")){
                System.out.println("infinito");
            }
            if(operazione.equals("divisibile")){
                if(numero1 % numero2 == 0){
                    System.out.println("il numero " + numero1 + " è divisibile per " + numero2);
                } else {
                    System.out.println("il numero " + numero1 + " NON è divisibile per " + numero2);
                }
            }

            System.out.println("scrivi 'y' se vuoi ripetere il programma: ");
            ripeti = scanner.nextLine();

        } //fine while

    } // fine funzione calcolatrice


    static Double somma(double a , double b){
        return  a+b;
    }

} //end class
