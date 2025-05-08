package atv2;

import java.util.Scanner;

public class Atv2Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
        int I = scanner.nextInt();
        boolean acompanhadaPorAdulto = scanner.nextBoolean();
        
        System.out.println((I>18 || acompanhadaPorAdulto) ? "Permissão consedida" : "Permissão negada");
        
	}

}
