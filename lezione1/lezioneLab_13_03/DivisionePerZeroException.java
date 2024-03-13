package lezioneLab_13_03;

public class DivisionePerZeroException extends Exception{


    public static final String EXC_MESSAGE = "DIVISIONE PER ZERO IMPOSSIBILE, ACCANNA";

    public DivisionePerZeroException(){
        super(EXC_MESSAGE);
    }

    public DivisionePerZeroException(String message){
        super(message);
    }




}
