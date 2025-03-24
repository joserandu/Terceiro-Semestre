package aula1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		float A = scanner.nextFloat();
		float B = scanner.nextFloat();
		
		double media = (A*3.5 + B*7.5) / 11;
		
		System.out.println("MEDIA=" + media);

	}

}
