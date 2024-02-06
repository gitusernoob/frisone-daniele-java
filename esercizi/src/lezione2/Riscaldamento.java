package lezione2;

import java.util.Scanner;

public class Riscaldamento {

    public static void main(String args[]){

        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserisci primo numero");
        int n1 = Integer.parseInt(tastiera.nextLine());
        System.out.println("inserisci secondo numero");
        int n2 = Integer.parseInt(tastiera.nextLine());
        System.out.println("somma = " + (n1 + n2));

        System.out.println("inserisci un nome");
        String nome = tastiera.nextLine();
        System.out.println("prima lettera : " + nome.substring(0,1) + " ultima lettera: " + nome.substring(nome.length()-1, nome.length()));

    }

}