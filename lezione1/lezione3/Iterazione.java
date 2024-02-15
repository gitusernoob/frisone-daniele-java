package lezione3;

public class Iterazione {


    public static void main(String[] args) {

        /*
            while(CONDIZIONE){
            }
         */

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        /*for(inizializzazione; condizione; aggiornamento){istruzioni}*/

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        int[] a = new int[10];

        a[0] = 1;
        a[3] = 6;

        System.out.println("l'array creato: ");
        for (int k= 0; k< a.length; k++){
            System.out.println(a[k]);
        }

        int b[] = {1,2,3,4,5,6};



    }


}
