package atv2;

import java.util.Scanner;

public class Atv2Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
        boolean emAvaliacaoGratuita = scanner.nextBoolean();
        
        System.out.println(!emAvaliacaoGratuita ? "Acesso restrito durante o período de avaliação gratuita" : "Acesso permitido ao conteúdo exclusivo");
       
	}

}
