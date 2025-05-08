package atv7;
import java.util.Map;
import java.util.TreeMap;

public class Atv7Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> capitais = new TreeMap<>();

        capitais.put("Brasil", "Brasília");
        capitais.put("China", "Pequim");
        capitais.put("Cuba", "Havana");

        System.out.println("Lista de Países e Capitais (ordem alfabética):");
        for (Map.Entry<String, String> entry : capitais.entrySet()) {
            System.out.println("País: " + entry.getKey() + " - Capital: " + entry.getValue());
        }
	}

}
