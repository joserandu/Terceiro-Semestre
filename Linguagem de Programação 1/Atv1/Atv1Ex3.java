package randuEx;

import java.util.Scanner;

// Desenvolva um programa que recebe a idade de uma pessoa e verifica se ela é maior de idade (considerando maior de idade como maior que 18 anos). Se for maior de idade, imprima "Maior de idade", caso contrário, "Menor de idade".

public class Atv1Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
        int I = scanner.nextInt();
        
        System.out.println(I>18 ? "Maior de Idade" : "Menor de idade");

	}

}
