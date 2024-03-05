package lezione6;

import lezione5.Bottiglia;

public class BottigliaConTappo extends lezione5.Bottiglia {

    public boolean aperta;

    public BottigliaConTappo(int capacita) {
        super(capacita); //utilizza quello che abbiamo scritto con la bottiglia
        this.aperta = true;
    }

    public BottigliaConTappo(int capacita, int quantita) {
        super(capacita, quantita);
        this.aperta = false;
    }

    public void chiudi(){
        this.aperta = false;
    }
    public void apri(){
        this.aperta = true;
    }


    @Override
    public String toString() {
        return super.toString() +
                "aperta=" + aperta;
    }


    @Override
    public void riempi(int quantita) {
        if(this.aperta){
            super.riempi(quantita);
        }

    }

    @Override
    public void svuota(int quantita) {
        if(this.aperta){
            super.svuota(quantita);
        }
    }
}
