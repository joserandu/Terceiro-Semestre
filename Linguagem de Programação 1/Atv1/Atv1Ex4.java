package randuEx;

import java.util.Scanner;

// Crie um programa que lê um número inteiro e verifica se ele é menor que zero. Se for, imprima "Negativo", caso contrário, imprima "Positivo” se for “Zero”, imprima “Zero".

public class Atv1Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
        int N = scanner.nextInt();
                
        if (N>0) {
        	System.out.println("Positivo");
        } else if (N==0) {
        	System.out.println("Zero");
        } else {
        	System.out.println("Negativo");
        }

	}

}
