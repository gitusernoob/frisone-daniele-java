package lezioneLab_21_03;

public class NumeroPariException extends Exception{

     static final String EXC_MESSAGE_PARI = "numero pari, non mi va bene ACCANNA";

    public NumeroPariException(){
        super(EXC_MESSAGE_PARI);
    }

    public NumeroPariException(String message){
        super(message);
    }
}
