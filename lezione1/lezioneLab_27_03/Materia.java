package lezioneLab_27_03;

import java.util.ArrayList;

public class Materia {

    String nomeMateria;
    ArrayList<Integer> votiMateria = new ArrayList<>();

    public Materia(String nomeMateria, ArrayList<Integer> votiMateria) {
        this.nomeMateria = nomeMateria;
        this.votiMateria = votiMateria;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nomeMateria='" + nomeMateria + '\'' +
                ", votiMateria=" + votiMateria +
                '}';
    }
}
