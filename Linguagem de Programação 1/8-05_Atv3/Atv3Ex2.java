package atv3;

import java.util.Scanner;

public class Atv3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String nome = scanner.nextLine();
			try {
				if (!nome.equals("admin")) {
					throw new Exception("Usuário não encontrado!");
				} 
					System.out.println("Login foi realizado com sucesso!");
					break;
					
			} catch (Exception e) {
				System.out.println("Erro: " + e);
			} finally {
				System.out.println("Tentativa de login concluida");

			}
		}
	}

}
