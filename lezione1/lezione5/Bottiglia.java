package lezione5;

public class Bottiglia {

    private int capacita;
    int quantita;



    public Bottiglia(int capacita) {
        this.capacita = capacita;
        this.quantita = 0;
    }

    public Bottiglia(int capacita, int quantita) {
        this.capacita = capacita;
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Bottiglia{" +
                "capacita=" + capacita +
                ", quantita=" + quantita +
                '}';
    }

    public void riempi(int quantita){
        this.quantita += quantita;
        if(this.quantita>capacita) this.quantita = capacita;
    }

    public void svuota(int quantita){
        this.quantita -= quantita;
        if(this.quantita <0) this.quantita = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bottiglia bottiglia = (Bottiglia) o;

        if (capacita != bottiglia.capacita) return false;
        return quantita == bottiglia.quantita;
    }


}
