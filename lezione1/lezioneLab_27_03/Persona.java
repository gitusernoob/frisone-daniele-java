package lezioneLab_27_03;

public class Persona {

    String nome;
    String codiceFiscale;
    String dataDiNascita;
    String soprannome = "";

    public Persona(String nome, String codiceFiscale, String dataDiNascita) {
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", dataDiNascita='" + dataDiNascita + '\'' +
                '}';
    }
}
