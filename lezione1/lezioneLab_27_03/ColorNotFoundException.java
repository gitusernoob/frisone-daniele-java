package lezioneLab_27_03;

public class ColorNotFoundException extends Exception {

    static final String EXC_MESSAGE = "non ho trovato il colore ahhhhhh, ACCANNA";

    public ColorNotFoundException(){
        super(EXC_MESSAGE);
    }

    public ColorNotFoundException(String message){
        super(message);
    }
}
