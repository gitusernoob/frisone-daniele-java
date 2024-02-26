package lezioneLab_26_02;

public class Oggetti {

    public static void main(String[] args) {
        Persona miaPersona = new Persona("Ciccio", "Pasticcio", 40);
        Persona secondaPersona = new Persona("Alberto", "Malesani");
        System.out.println(miaPersona);
        System.out.println(secondaPersona);

        miaPersona.setCodFiscalePersona("osdifjaosifjs");
        System.out.println(miaPersona);



    }




}
