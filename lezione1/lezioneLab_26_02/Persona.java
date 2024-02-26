package lezioneLab_26_02;

/**
 * @author Frisone Daniele
 * Questa classe serve per imparare le basi degli oggetti. proprietà costruttori metodi
 */
public class Persona {

    public String nomePersona;
    public String cognomePersona;
    public Integer etaPersona;
    private String codFiscalePersona;

    public Persona(){

    }

    /**
     * costruttore
     * @param nomePersona nome della persona a cui si vuole inizializzare l'oggetto
     * @param cognomePersona cognome della persona a cui si vuole inizializzare l'oggetto
     */
    public Persona(String nomePersona, String cognomePersona){
        this.nomePersona = nomePersona;
        this.cognomePersona = cognomePersona;
    }

    /**
     *
     * @param nomePersona == nome
     * @param cognomePersona == cognome
     * @param etaPersona == eta
     */
    public Persona(String nomePersona, String cognomePersona, Integer etaPersona){
        this.nomePersona = nomePersona;
        this.cognomePersona = cognomePersona;
        this.etaPersona = etaPersona;
    }

    public String getCodFiscalePersona() {
        return codFiscalePersona;
    }

    public void setCodFiscalePersona(String codFiscalePersona) {
        this.codFiscalePersona = codFiscalePersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nomePersona='" + nomePersona + '\'' +
                ", cognomePersona='" + cognomePersona + '\'' +
                ", etaPersona=" + etaPersona +
                ", codFiscalePersona='" + codFiscalePersona + '\'' +
                '}';
    }
}
