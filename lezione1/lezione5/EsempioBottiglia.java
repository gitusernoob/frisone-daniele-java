package lezione5;

public class EsempioBottiglia {

    public static void main(String[] args) {

        Bottiglia b1 = new Bottiglia(1500);

        System.out.println(b1.toString());

        b1.riempi(15500);
        System.out.println(b1);
        b1.svouta(1600);
        System.out.println(b1);

        Bottiglia b2 = new Bottiglia(500);
        b2.riempi(200);
        b2.svouta(50);
        System.out.println(b2);

    }
}
