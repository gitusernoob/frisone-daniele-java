package lezione3;

import java.util.ArrayList;
import java.util.List;

public class EsempioArray {

    public static void main(String[] args) {
        List<Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(9393);
        System.out.println(numeri);
        numeri.remove(0);
        System.out.println(numeri);
    }



}
