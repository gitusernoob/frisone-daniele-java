package lezione5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class esercizi20_02 {

    /*
    public static void main(String[] args) {
        System.out.println("Inserisci l'espressione in notazione polacca inversa: ");
        Scanner tastiera = new Scanner(System.in);
        boolean continua = true;
        List<Integer> stack = new ArrayList<>();
        while (continua) {
            String token = tastiera.next();

            switch (token) {
                case "+":
                    stack = sommaCalc(stack);
                    break;
                case "-":
                    stack = diffCalc(stack);
                    break;
                case "*":
                    stack = moltCalc(stack);
                    break;
                case "/":
                    stack = divCalc(stack);
                    break;
                case "=":
                    System.out.println(stack.get(stack.size() - 1));
                    continua = false;
                    break;
                default:
                    int n = Integer.parseInt(token);
                    stack.add(n);

            } //fine switch

        } //fine while

    } //fine main
*/

    public static void main(String[] args) {
        System.out.println("Inserisci l'espressione in notazione polacca inversa: ");
        Scanner tastiera = new Scanner(System.in);
        boolean continua = true;
        List<Integer> stack = new ArrayList<>();
        while(continua){
            String token = tastiera.next();

            switch (token){
                case "+":
                    if (stack.size() < 2){
                        System.out.println("ERRORE");
                        continua = false;
                    }else {
                        int n1 = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);

                        int n2 = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);
                        stack.add(n1+n2);
                    }
                    break;
                case "-":
                    if (stack.size() < 2){
                        System.out.println("ERRORE");
                        continua = false;
                    }else {
                        int n1 = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);

                        int n2 = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);
                        stack.add(n2-n1);
                    }
                    break;
                case "*":
                    if (stack.size() < 2){
                        System.out.println("ERRORE");
                        continua = false;
                    }else {
                        int n1 = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);

                        int n2 = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);
                        stack.add(n1*n2);
                    }

                    break;
                case "/":
                    if (stack.size() < 2){
                        System.out.println("ERRORE");
                        continua = false;
                    }else {
                        int n1 = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);

                        int n2 = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);
                        stack.add(n2/n1);
                    }

                    break;
                case "=":
                    System.out.println(stack.get(stack.size()-1));
                    continua = false;
                    break;
                default:
                    int n = Integer.parseInt(token);
                    stack.add(n);
            }
        }
    }

    public static List<Integer> sommaCalc(List<Integer> lista){
        Integer somma = 0;
        for (int i = 0; i<lista.size(); i++){
            somma += lista.get(i);
        }
        lista.clear();
        lista.add(somma);
        return lista;
    }

    public static List<Integer> diffCalc(List<Integer> stack){
        Integer diff = stack.get(0); // qua prendi il primo valore da cui sottrarre
        for (int i = 1; i<stack.size(); i++){ // qua fai partire da 1
            diff -= stack.get(i);
        }
        stack.clear();
        stack.add(diff);
        return stack;
    }

    public static List<Integer> moltCalc(List<Integer> stack){
        Integer molt = 1; //il primo valore dello stack viene moltiplicato per 1,
        for (int i = 0; i<stack.size(); i++){
            molt *= stack.get(i);
        }
        stack.clear();
        stack.add(molt);
        return stack;
    }

    public static List<Integer> divCalc(List<Integer> stack){
        Integer div = stack.get(0);
        for (int i = 1; i<stack.size(); i++){
            div /= stack.get(i);
        }
        stack.clear();
        stack.add(div);
        return stack;
    }





}
