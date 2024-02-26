package lezioneLab_26_02;

public class PersonaNuova {


    public String nomePersona;
    public String cognomePersona;
    public Integer numeroTelefono;
    private Integer iban;


    public  void aggiungiSoldi(Integer soldi){
        System.out.println("sto aggiungendo " + soldi + "€ al conto iban: " + iban );
    }

    public void chiamaTelefono(){
        System.out.println("sto chiamando il numero " +numeroTelefono + "...");
    }

    public PersonaNuova(String nomePersona, String cognomePersona, Integer numeroTelefono) {
        this.nomePersona = nomePersona;
        this.cognomePersona = cognomePersona;
        this.numeroTelefono = numeroTelefono;
    }

    public PersonaNuova(String nomePersona, String cognomePersona, Integer numeroTelefono, Integer iban) {
        this.nomePersona = nomePersona;
        this.cognomePersona = cognomePersona;
        this.numeroTelefono = numeroTelefono;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "PersonaNuova{" +
                "nomePersona='" + nomePersona + '\'' +
                ", cognomePersona='" + cognomePersona + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                '}';
    }

    public Integer getIban() {
        return iban;
    }

    public void setIban(Integer iban) {
        this.iban = iban;
    }
}
