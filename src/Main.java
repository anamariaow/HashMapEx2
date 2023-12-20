import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Creare un hashmap,
        Map<String, String> capitali = new HashMap<>();

        capitali.put("Italia", "Roma");
        capitali.put("Inghilterra", "Londra");
        capitali.put("Germania", "Berlino");
        capitali.put("Francia", "Parigi");

        System.out.println("Capitali: " + capitali);

        // prendere tutti i valori,
        Collection<String> values = capitali.values();
        System.out.println("Values: " + values);

        //ordinarli e stamparli
        ArrayList<String> ordinati = new ArrayList<>(values);
        ordinati.sort(Comparator.naturalOrder());
        System.out.println("Lista ordinata: " + ordinati);
    }
}