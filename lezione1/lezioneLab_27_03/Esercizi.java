package lezioneLab_27_03;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Esercizi {

    static List<Persona> arrayPersone = new ArrayList<Persona>();
    public static void main(String[] args) {

        List<String> colorList = new ArrayList<String>(List.of("rosso", "arancione", "giallo", "verde"));
//        for (String color : colorList){
//            System.out.println("colore: " + color);
//        }
        String colore = "verde";
        System.out.println("il colore " + colore + " è presente? " + verificaPresenzaColore(colore, colorList));
        if(trovaIndiceColore(colore, colorList) != -1){
            System.out.println("la sua posizione è : " + trovaIndiceColore(colore, colorList));
        }

        // esercizio array persone

        Persona p1 = new Persona("pippo", "x", "12.12.2002");
        Persona p2 = new Persona("filippo", "y", "12.11.2002");
        Persona p3 = new Persona("tizio", "z", "12.01.2000");
        Persona p4 = new Persona("caio", "w", "12.11.2000");
        Persona p5 = new Persona("tullio", "k", "12.01.2000");
        Persona p6 = new Persona("arman", "zibby", "12.11.1969");

        aggiungiPersona(p1, arrayPersone);
        aggiungiPersona(p2, arrayPersone);
        aggiungiPersona(p3, arrayPersone);
        aggiungiPersona(p4, arrayPersone);
        aggiungiPersona(p5, arrayPersone);
        aggiungiPersona(p6, arrayPersone);

        //esercizio trova tramite codice fiscale

//       trovaPersonaTramiteCF("x", arrayPersone);

        System.out.println("\n\n\n");
        //esercizio trova compleanni uguali
        //trovaCompleanniUguali(arrayPersone);
        
        trovaCompleanniUguali2(arrayPersone);

        //trova chi è nato lo stesso mese
        trovaMesiUguali(arrayPersone, 11);

        //crea una struttura italia con regioni con liste città

        ArrayList<RegioneCitta> italia = new ArrayList<>();

        RegioneCitta piemonte = new RegioneCitta("Piemonte", new ArrayList<String>(List.of("alba", "bra", "cuneo")));
        RegioneCitta sicilia = new RegioneCitta("Sicilia", new ArrayList<String>(List.of("messina", "catania", "palermo")));

        italia.add(piemonte);
        italia.add(sicilia);

        System.out.println();
        for (RegioneCitta rc : italia){
            System.out.println(rc);
        }


        //media voti materie

        ArrayList<Materia> listaMaterie = new ArrayList<>();
        Materia matematica = new Materia("matematica", new ArrayList<Integer>(List.of(7,8,7,4,7)));
        Materia geografia = new Materia("geografia", new ArrayList<Integer>(List.of(7,2,5,4)));
        listaMaterie.add(matematica);
        listaMaterie.add(geografia);
        sufficienteOrNot(listaMaterie);

        //togli voti duplicati

        System.out.println("prima con duplicati: " + matematica.votiMateria);
        ArrayList<Integer> arraySenzaDuplicati = new ArrayList<>(new HashSet<>(matematica.votiMateria));
        System.out.println("dopo senza duplicati: " + arraySenzaDuplicati);

    }

    private static void sufficienteOrNot(ArrayList<Materia> listaMaterie) {
        for (Materia m : listaMaterie){
            if(media(m.votiMateria)<6){
                System.out.println("sei insufficiente in " + m.nomeMateria + " " + media(m.votiMateria));
            } else {
                System.out.println("sei sufficente in " + m.nomeMateria + " " + media(m.votiMateria));
            }
        }
    }

    private static double media(ArrayList<Integer> arrayVoti){

        int somma = 0;
        for (int n : arrayVoti){
            somma+=n;
        }
        return (double) somma /arrayVoti.size();
    }

    private static void trovaMesiUguali(List<Persona> arrayPersone, Integer meseScelto) {

        int justOne =0;
        for (int i = 0; i < arrayPersone.size(); i++) {
            for (int j = i + 1; j < arrayPersone.size(); j++) {
                String mese1 = arrayPersone.get(i).dataDiNascita.substring(3,5);
                String mese2 = arrayPersone.get(j).dataDiNascita.substring(3,5);

                if (mese1.equals(mese2) && mese1.equals(meseScelto.toString())) {
                    if(justOne == 0){
                        justOne =1;
                        arrayPersone.get(i).soprannome = "ilPrimoDegliImbecilli";
                        System.out.println("il soprannome di " + arrayPersone.get(i).nome + " diventa " + arrayPersone.get(i).soprannome);
                    }
                     System.out.println( arrayPersone.get(i).nome + " " + arrayPersone.get(j).nome + " hanno lo stesso mese di compleanno " + mese1);
                }
            }
        }

    }


    static class DataArrayNomi{
        String data;
        ArrayList<Persona> listaPersone;
        
        public DataArrayNomi(String data, ArrayList<Persona> listaPersone) {
            this.data = data;
            this.listaPersone = listaPersone;
        }

        @Override
        public String toString() {
            return "CompleannoArray{" +
                    "data='" + data + '\'' +
                    ", listaPersone=" + listaPersone +
                    '}';
        }
    }

    private static void trovaCompleanniUguali2(List<Persona> arrayPersone) {
        ArrayList<DataArrayNomi> arrayDataNomi = new ArrayList<>();
        
        ArrayList<String> arrayCompleanni = new ArrayList<>();

        //lista compleanni unici. ci sara una funzione più furba
        for (Persona p : arrayPersone){
            if(!arrayCompleanni.contains(p.dataDiNascita)){
                arrayCompleanni.add(p.dataDiNascita);
            }
        }

        //per ogni compleanno aggiungo un oggetto dataarraynomi con solo data
        for (String compleanno : arrayCompleanni){
            ArrayList<Persona> arrayP = new ArrayList<>();
            DataArrayNomi c = new DataArrayNomi(compleanno, arrayP);
            arrayDataNomi.add(c);
        }

        //per ogni persona verifico che la data sia uguale alla data di arraydatanomi ed aggiungo
        for (Persona p : arrayPersone){
            for (DataArrayNomi ad : arrayDataNomi){
                if(p.dataDiNascita.equals(ad.data)){
                    ad.listaPersone.add(p);
                }
            }
        }

        //stampo il risultato
        for (DataArrayNomi ad : arrayDataNomi){
            System.out.println(ad);
        }

    }

    private static void trovaCompleanniUguali(List<Persona> arrayPersone) {

        for (int i = 0; i < arrayPersone.size(); i++) {
            for (int j = i + 1; j < arrayPersone.size(); j++) {
                if (arrayPersone.get(i).dataDiNascita.equals(arrayPersone.get(j).dataDiNascita)) {
                    System.out.println( arrayPersone.get(i).nome + " " + arrayPersone.get(j).nome + " hanno lo stesso compleanno " + arrayPersone.get(i).dataDiNascita);
                }
            }
        }
        
    }

    private static void trovaPersonaTramiteCF(String cf, List<Persona> arrayPersone) {
        try {
            boolean trovato = false;
            for (Persona persona : arrayPersone){
                if(persona.codiceFiscale.equals(cf)){
                    System.out.println(persona);
                    trovato = true;
                }
            }

            if(!trovato){
                throw new PersonaNotFoundException(PersonaNotFoundException.EXC_MESSAGE);
            }
        } catch (PersonaNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

    private static void aggiungiPersona(Persona p, List<Persona> arrayPersone) {
        try {
            int indice = arrayPersone.indexOf(p);
            for (Persona persona : arrayPersone){
                if(persona.codiceFiscale == p.codiceFiscale){
                    throw new PersonaAlreadyExistExcpetion(PersonaAlreadyExistExcpetion.EXC_MESSAGE);
                }
            }
            arrayPersone.add(p);
            System.out.println("la persona è stata aggiunta con successo");

        } catch (PersonaAlreadyExistExcpetion e){
            System.out.println(e.getMessage());
        }
    }

    private static int  trovaIndiceColore(String coloreInviato, List<String> colorList) {
        int indice = -1;
        try {
            indice = colorList.indexOf(coloreInviato);
            if(indice == -1){
                throw new ColorNotFoundException(ColorNotFoundException.EXC_MESSAGE);
            }
        } catch (ColorNotFoundException e){
            System.out.println(e.getMessage());
        }

        return indice;
    }

    private static boolean verificaPresenzaColore(String coloreInviato, List<String> colorList)
    {
        boolean ret = false;
        for (String color : colorList){
            if(color.equals(coloreInviato)){
                ret = true;
            }
        }
        return ret;
    }


}
