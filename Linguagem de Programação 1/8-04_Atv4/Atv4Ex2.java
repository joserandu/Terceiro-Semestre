package atv4;

import java.util.Scanner;

class AcessoNegadoException extends Exception{
	public AcessoNegadoException (String login){
		super(login);
	}
}

public class Atv4Ex2 {
	
	public static void verificarAcesso(String login) throws AcessoNegadoException {
		// TODO Auto-generated method stub

		if (!login.equals("admin")) { 
			throw new AcessoNegadoException("Acesso negado");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String login = scanner.nextLine();
			try {
				verificarAcesso(login);
				System.out.println("Seja bem-vindo(a)!");
				break;
			} catch (AcessoNegadoException e) {
				System.out.println(e);
			}
			
		}
	
		
	}

}
