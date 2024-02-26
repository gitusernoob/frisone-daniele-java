package lezioneLab_26_02;

public class Animale {

    public String nomeAnimale;
    public Integer pesoAnimale;
    public String ruggitoAnimale;
    public String ciboAnimale;

    public Animale(String nomeAnimale, Integer pesoAnimale, String ruggitoAnimale, String ciboAnimale) {
        this.nomeAnimale = nomeAnimale;
        this.pesoAnimale = pesoAnimale;
        this.ruggitoAnimale = ruggitoAnimale;
        this.ciboAnimale = ciboAnimale;
    }

    public void ruggisce(){
        System.out.println(this.ruggitoAnimale);
    }
    public void mangia(){
        System.out.println(this.nomeAnimale + " mangia " + this.ciboAnimale);
    }



}
