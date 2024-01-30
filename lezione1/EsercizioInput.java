import java.util.Scanner;

public class EsercizioInput{

    public static void main(String args[]){

        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisci un nome");
        String nome = tastiera.nextLine();
        System.out.println(nome);

    }

}