package atv5;
import java.util.ArrayList;
import java.util.Collections;

public class Atv5Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Maçã");
		lista.add("Banana");
		lista.add("Pera");
		lista.add("Laranja");
		
		System.out.println(lista);
		
		Collections.reverse(lista);
		
		System.out.println(lista);

	}

}
