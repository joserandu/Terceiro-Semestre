package atv4;

import java.util.Scanner;

public class Atv4Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int idade = scanner.nextInt();
			try {
				if (idade < 18) {
					throw new Exception("Usuário não tem idade suficiente para entrar no evento!");
				} 
					System.out.println("Seja bem-vindo(a)!");
					break;
					
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
	}

}
