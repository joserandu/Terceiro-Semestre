package randuEx;

import java.util.Scanner;

// Desenvolva um programa que lê a temperatura atual de uma cidade em graus Celsius e verifica se está abaixo ou igual a 0 graus. Se a condição for verdadeira, imprima "Possibilidade de neve", caso contrário, "Sem previsão de neve”.

public class Atv1Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
        int T = scanner.nextInt();
                
        System.out.println(T<=0 ? "Possibilidade de neve" : "Sem previsão de neve");
	
	}

}
