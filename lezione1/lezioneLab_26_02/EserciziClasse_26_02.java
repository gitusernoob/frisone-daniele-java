package lezioneLab_26_02;

public class EserciziClasse_26_02 {

    /**
     * @author Daniele Frisone
     * questa classe serve per fare gli esercizi delle slide del 26_02
     */

    public static void main(String[] args) {


        PersonaNuova esempioPersona = new PersonaNuova("ciccio", "pazzo", 349992002, 938493029);
        esempioPersona.chiamaTelefono();
        esempioPersona.aggiungiSoldi(600);
        System.out.println(esempioPersona.getIban());

        Animale pollo = new Animale("pollo", 8, "cocococo", "mais");
        pollo.ruggisce();
        pollo.mangia();

    }

}
