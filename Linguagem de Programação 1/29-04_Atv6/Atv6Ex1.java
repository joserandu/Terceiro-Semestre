package atv6;
import java.util.*;

class Produto {
    private int codigo;    
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produto)) return false;
        Produto p = (Produto) obj;
        return this.codigo == p.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

public class Atv6Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Produto> produtos = new HashSet<>();
	        Scanner scanner = new Scanner(System.in);

	        // Adiciona produtos
	        produtos.add(new Produto(1, "Notebook", 3500.00));
	        produtos.add(new Produto(2, "Mouse", 120.00));
	        produtos.add(new Produto(3, "Teclado", 200.00));

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1 - Verificar produto por código");
	            System.out.println("2 - Remover produto por código");
	            System.out.println("3 - Exibir todos os produtos");
	            System.out.println("4 - Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();

	            if (opcao == 1) {
	                System.out.print("Digite o código do produto: ");
	                int cod = scanner.nextInt();
	                boolean encontrado = false;
	                for (Produto p : produtos) {
	                    if (p.getCodigo() == cod) {
	                        System.out.println("Produto encontrado: " + p);
	                        encontrado = true;
	                        break;
	                    }
	                }
	                if (!encontrado) {
	                    System.out.println("Produto com código " + cod + " não encontrado.");
	                }

	            } else if (opcao == 2) {
	                System.out.print("Digite o código do produto a remover: ");
	                int cod = scanner.nextInt();
	                Produto paraRemover = null;
	                for (Produto p : produtos) {
	                    if (p.getCodigo() == cod) {
	                        paraRemover = p;
	                        break;
	                    }
	                }
	                if (paraRemover != null) {
	                    produtos.remove(paraRemover);
	                    System.out.println("Produto removido com sucesso.");
	                } else {
	                    System.out.println("Produto com código " + cod + " não encontrado.");
	                }

	            } else if (opcao == 3) {
	                System.out.println("\nProdutos cadastrados:");
	                for (Produto p : produtos) {
	                    System.out.println(p);
	                }

	            } else if (opcao == 4) {
	                System.out.println("Encerrando...");
	                break;
	            } else {
	                System.out.println("Opção inválida.");
	            }
	        }

	        scanner.close();
	}

}
