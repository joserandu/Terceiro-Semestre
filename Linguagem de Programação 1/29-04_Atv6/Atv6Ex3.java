package atv6;

import java.util.LinkedHashSet;
import java.util.Set;

public class Atv6Ex3 {
    public static void main(String[] args) {
        Set<String> frutas = new LinkedHashSet<>();

        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");

        String fruta_pesquisa = "uva";
        
        if (frutas.contains(fruta_pesquisa)) {
            System.out.println("A fruta '" + fruta_pesquisa + "' está presente no conjunto.");
        } else {
            System.out.println("A fruta '" + fruta_pesquisa + "' NÃO está presente no conjunto.");
        }

        frutas.remove("banana");

        System.out.println("\nFrutas no conjunto após remoção de 'banana':");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
