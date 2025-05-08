package atv5;

import java.util.ArrayList;
import java.util.Collections;

public class Atv5Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Integer> lista = new ArrayList<>();

		lista.add(30);
		lista.add(10);
		lista.add(50);
		lista.add(20);
		lista.add(40);
		
		if(lista.indexOf(50) != -1) {
			lista.remove(lista.indexOf(50));
		}
		
		System.out.println(lista);
		
		Collections.shuffle(lista);
	
		System.out.println(lista);

	}

}
