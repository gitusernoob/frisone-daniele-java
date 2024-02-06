package lezione2;

import java.util.Scanner;

public class booleani {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        boolean a= true, b = false;
        System.out.println(a + " " + b);
        System.out.println(!a + " " + !b);
        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && b);
        System.out.println("or");
        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || b);
        */

        //chiedi eta e stampare true se maggiore 18
/*

        System.out.println("inserisci età");
        int  eta = Integer.parseInt(scanner.nextLine());
        boolean condizione = eta >= 18;
        System.out.println(condizione);

        //chiedere se voto è insufficiente

        System.out.println("inserisci voto");
        int voto = Integer.parseInt(scanner.nextLine());
        boolean cond2 = voto<5 && voto>=0;
        System.out.println(cond2);


        for(int i = 0; i < 4; i++ ){
            System.out.println("inserisci data");
            int data = Integer.parseInt(scanner.nextLine());
            boolean cond3 = ((data%4 == 0) && (data%100 != 0)) || (data%400 == 0);
            System.out.println("bisestile: " + cond3);
        }

*/

        String nomeUtente = "pippo";
        String passwordUtente = "pass";

        System.out.println("inserisci utente");
        String utente = scanner.nextLine();

        System.out.println("inserisci password");
        String password = scanner.nextLine();

        System.out.println(utente.equals(nomeUtente) && password.equals(passwordUtente));









    }
}
