package lezione6;

public class MainBottiglia {

    public static void main(String[] args) {

        BottigliaConTappo b = new BottigliaConTappo(400);
        System.out.println(b);
        b.chiudi(); //chiudo la bottiglia
        System.out.println(b);
        b.riempi(100); //non puoi riempire. la bottiglia è chiusa prima
        System.out.println(b);

    }
}
