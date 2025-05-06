package randuEx;

import java.util.Scanner;

// Escreva um programa que verifica se a senha inserida pelo usuário é diferente de uma senha armazenada na variável senhaCorreta. Se a senha for diferente, imprima "Senha incorreta", caso contrário, imprima "Acesso concedido".

public class Atv1Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	    
		String senhaCorreta = "123456789";
        String senha = scanner.nextLine();
        
        System.out.println(senha.equals(senhaCorreta) ? "Acesso concedido" : "Senha incorreta");
        
	}

}
