package atv3;

import java.util.Scanner;

public class Atv3Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		
		String[] semana = { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

		while (true) {
			try {
				int A = scanner.nextInt();
				System.out.printf(semana[A - 1]);
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Insira um número válido!");
			}
		}
	}

}
