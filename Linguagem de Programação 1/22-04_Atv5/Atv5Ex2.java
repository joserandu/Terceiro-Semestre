package atv5;

import java.util.ArrayList;

public class Atv5Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Maçã");
		lista.add("Banana");
		lista.add("Pera");
		lista.add("Laranja");
		
		System.out.println(lista);
		
		lista.remove("Pera");
		
		System.out.println(lista);

	}

}
