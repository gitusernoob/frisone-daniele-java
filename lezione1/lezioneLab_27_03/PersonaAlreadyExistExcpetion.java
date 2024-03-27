package lezioneLab_27_03;

public class PersonaAlreadyExistExcpetion extends Exception {

    static final String EXC_MESSAGE = "codice fiscale uguale, ACCANNA";

    public PersonaAlreadyExistExcpetion(){
        super(EXC_MESSAGE);
    }

    public PersonaAlreadyExistExcpetion(String message){
        super(message);
    }
}
