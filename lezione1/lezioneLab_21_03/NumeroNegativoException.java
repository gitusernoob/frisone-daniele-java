package lezioneLab_21_03;

public class NumeroNegativoException extends Exception{
     static final String EXC_MESSAGE = "radice quadrata di un numero negativo, ACCANNA";

    public NumeroNegativoException(){
        super(EXC_MESSAGE);
    }

    public NumeroNegativoException(String message){
        super(message);
    }

}
