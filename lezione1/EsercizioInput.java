import java.util.Scanner;

public class EsercizioInput{

    public static void main(String args[]){

        Scanner tastiera = new Scanner(System.in);
        /*
        System.out.println("inserisci un nome");
        String nome = tastiera.nextLine();
        //System.out.println(nome);
        System.out.println("inserisci un cognome");
        String cognome = tastiera.nextLine();
        System.out.println("inserisci un età");
        int età = Integer.parseInt(tastiera.nextLine());
        System.out.println("ciao " + nome + " " + cognome + " " + età*2);
        */

        System.out.println("inserisci base rettangolo");
        int base = Integer.parseInt(tastiera.nextLine());
        System.out.println("inserisci altezza rettangolo");
        int altezza = Integer.parseInt(tastiera.nextLine());
        System.out.println("l'area del rettangolo = " + base * altezza);

        double area = (double)(base*altezza);
        System.out.println("l'area del rettangolo = " + area);

        
        
    }

}