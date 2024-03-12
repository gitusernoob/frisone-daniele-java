package lezione7.liste;

public class Liste {


    public static void main(String[] args) {
        List a = new Nil();
        List b = new Node(1,new Node(2, new Nil()));
        System.out.println(b.length());

        System.out.println(b);
        b.add(4);
        b.add(5);
        System.out.println(b.get(0) + " " +  b.get(1)+ " " + b.get(2) + " " + b.get(3) );

    }

}
