package atv2;

import java.util.Scanner;

public class Atv2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
        boolean temCartaoLoja = scanner.nextBoolean();
        boolean compraAcimaDeCemReais = scanner.nextBoolean();
        
        System.out.println(temCartaoLoja && compraAcimaDeCemReais ? "Permissão para parcelar a compra sem juros" : "Permissão negada para parcelar a compra sem juros");
        
	}

}
