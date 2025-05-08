package atv7;
import java.util.HashMap;
import java.util.Map;

public class Atv7Ex1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

    	HashMap<String, Double> notas = new HashMap<>();

        notas.put("Crestane", 9.9);
        notas.put("Randú", 10.0);
        notas.put("Erick", 0.0);

        System.out.println("Notas dos Alunos:");
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println("Aluno: " + entry.getKey() + " - Nota: " + entry.getValue());
        }
    }
}
