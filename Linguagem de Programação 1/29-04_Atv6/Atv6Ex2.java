package atv6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

class Compromisso implements Comparable<Compromisso> {
    private LocalDate data;
    private LocalTime horario;
    private String descricao;

    public Compromisso(LocalDate data, LocalTime horario, String descricao) {
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    @Override
    public int compareTo(Compromisso outro) {
        int comparacaoData = this.data.compareTo(outro.data);
        if (comparacaoData != 0) return comparacaoData;
        return this.horario.compareTo(outro.horario);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Compromisso)) return false;
        Compromisso c = (Compromisso) obj;
        return Objects.equals(data, c.data) && Objects.equals(horario, c.horario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, horario);
    }

    @Override
    public String toString() {
        return "Compromisso{" +
                "data=" + data +
                ", horario=" + horario +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

public class Atv6Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Compromisso> compromissos = new TreeSet<>();

        compromissos.add(new Compromisso(LocalDate.of(2025, 5, 10), LocalTime.of(9, 0), "Consulta médica"));
        compromissos.add(new Compromisso(LocalDate.of(2025, 5, 10), LocalTime.of(14, 0), "Reunião com cliente"));
        compromissos.add(new Compromisso(LocalDate.of(2025, 5, 12), LocalTime.of(10, 30), "Apresentação do projeto"));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Verificar compromissos por data");
            System.out.println("2 - Remover compromissos por data");
            System.out.println("3 - Exibir todos os compromissos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite a data (AAAA-MM-DD): ");
                LocalDate dataBusca = LocalDate.parse(scanner.next());
                boolean encontrado = false;
                for (Compromisso c : compromissos) {
                    if (c.getData().equals(dataBusca)) {
                        System.out.println(c);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Nenhum compromisso encontrado para essa data.");
                }

            } else if (opcao == 2) {
                System.out.print("Digite a data (AAAA-MM-DD) dos compromissos a remover: ");
                LocalDate dataRemover = LocalDate.parse(scanner.next());
                boolean removido = compromissos.removeIf(c -> c.getData().equals(dataRemover));
                if (removido) {
                    System.out.println("Compromissos removidos com sucesso.");
                } else {
                    System.out.println("Nenhum compromisso encontrado para essa data.");
                }

            } else if (opcao == 3) {
                System.out.println("\nTodos os compromissos cadastrados:");
                for (Compromisso c : compromissos) {
                    System.out.println(c);
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
