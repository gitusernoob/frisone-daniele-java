package lezioneLab_27_03;

import java.util.ArrayList;

public class RegioneCitta {

    String regione;
    ArrayList<String> listaCittà;

    public RegioneCitta(String regione, ArrayList<String> listaCittà) {
        this.regione = regione;
        this.listaCittà = listaCittà;
    }

    @Override
    public String toString() {
        return "RegioneCitta{" +
                "regione='" + regione + '\'' +
                ", listaCittà=" + listaCittà +
                '}';
    }
}
