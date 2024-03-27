package lezioneLab_27_03;

public class PersonaNotFoundException  extends  Exception{

    static final String EXC_MESSAGE = "persona non trovata, ACCANNA";

    public PersonaNotFoundException(){
        super(EXC_MESSAGE);
    }

    public PersonaNotFoundException(String message){
        super(message);
    }
}
