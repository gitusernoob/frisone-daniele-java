package lezioneLab_21_03;

public class Esercizi {

    public static void main(String[] args) {

        int n = 20;
        String s = "filippo";

        if (n %2 == 0){
          // throw new NumeroPariException(NumeroPariException.EXC_MESSAGE_PARI);
        }

        if(n<0){
            //throw new NumeroNegativoException(NumeroNegativoException.EXC_MESSAGE);
        }

        if(s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")){
            System.out.println("contiene vocali la stringa");
        } else {
            //throw new NumeroPariException(NumeroPariException.EXC_MESSAGE);
        }



    }


}
