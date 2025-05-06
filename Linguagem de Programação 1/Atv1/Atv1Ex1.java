package randuEx;

// Escreva um programa em Java que lê duas variáveis inteiras, a e b. Imprima "Iguais" se os valores forem iguais ou "Diferentes" se os valores forem diferentes.

import java.util.Locale;
import java.util.Scanner;

public class Atv1Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	Scanner scanner = new Scanner(System.in);
	    scanner.useLocale(Locale.US);
		
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if (A == B) {
            System.out.printf("Iguais");
        } else {
            System.out.printf("Diferentes");
        }
		
	}

}
