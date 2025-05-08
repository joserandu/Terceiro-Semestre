package atv2;

import java.util.Scanner;

public class Atv2Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
        int idade = scanner.nextInt();
        boolean temAutorizacaoDosPais = scanner.nextBoolean();
        int altura = scanner.nextInt();
        
        System.out.println(
        			(idade > 12 && altura >= 150) || 
        			 temAutorizacaoDosPais && altura >= 140 ?
        					 "Permissão concedida" :
        						 "Permissão negada"
        		);
		
	}

}
