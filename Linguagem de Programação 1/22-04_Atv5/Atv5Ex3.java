package atv5;

import java.util.ArrayList;

public class Atv5Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Maçã");
		lista.add("Banana");
		lista.add("Laranja");
		
		System.out.println(lista);
				
		if (lista.indexOf("Banana") != -1) {
			lista.set(lista.indexOf("Banana"), "Abacaxi");
		}
		
		System.out.println(lista);

	}

}
