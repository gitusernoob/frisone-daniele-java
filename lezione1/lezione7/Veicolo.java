package lezione7;

public class Veicolo {

    private TipoVeicolo tipoVeicolo;

    public Veicolo(TipoVeicolo tipoVeicolo) {
        this.tipoVeicolo = tipoVeicolo;
    }

    public enum TipoVeicolo{
        AUTO,MOTO,BICI
    }

}
