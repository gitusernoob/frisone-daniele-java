/*scrivere un programma con variabili a e b intere
 e c e d double, utilizzare le 4 +1 operazioni e fare print*/
public class Operazioni{

    public static void main(String args[]){
        int a = 5;
        int b = 4;
        double c = 23.7;
        double d = 14.7;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c%d);

        System.out.println(a+d);
        System.out.println(c-b);
        System.out.println(c*b);
        System.out.println(d/b);
        System.out.println(a%d);


    }
}