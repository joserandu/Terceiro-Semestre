package atv7;
import java.util.LinkedHashMap;
import java.util.Map;

public class Atv7Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String, Double> produtos = new LinkedHashMap<>();

        produtos.put("Flack Jack", 799.90);
        produtos.put("Berma da Cyclone", 349.90);
        produtos.put("Boné Crochê", 239.00);

        System.out.println("Lista de Produtos e Preços (ordem de cadastro):");
        for (Map.Entry<String, Double> entry : produtos.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + " - Preço: R$ " + entry.getValue());
        }
	}

}
