package lezioneLab1;

import java.util.Arrays;

public class Esercizi2102 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3}, {7, 8, 9}};

        boolean duplicateFound = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Arrays.equals(array[i], array[j])) {
                    duplicateFound = true;
                    break;
                }
            }
            if (duplicateFound) {
                break;
            }
        }

        if (duplicateFound) {
            System.out.println("Ci sono due righe uguali all'interno dell'array.");
        } else {
            System.out.println("Non ci sono due righe uguali all'interno dell'array.");
        }
    }
}


