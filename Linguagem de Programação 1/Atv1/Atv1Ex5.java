package randuEx;

import java.util.Scanner;

// Faça um programa que lê a quantidade de pontos que um time de futebol acumulou em um campeonato. Considerando que a classificação para a próxima fase requer no mínimo 30 pontos, o programa deve verificar se o time conseguiu se classificar. Se o time tiver 30 pontos ou mais, imprima "Classificado para a próxima fase". Caso contrário, imprima "Não classificado".

public class Atv1Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
        int P = scanner.nextInt();
                
        System.out.println(P>30 ? "Classificado para a próxima fase" : "Não classificado");
		
	}

}
