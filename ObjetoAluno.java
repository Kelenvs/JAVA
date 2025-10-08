import java.util.Scanner;

public class ObjetoAluno{

    private String nome;
    private int idade;
    private String matricula;

    // Construtor
    public ObjetoAluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

     public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // consome quebra de linha

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        // cria o objeto com os dados informados
        ObjetoAluno aluno = new ObjetoAluno(nome, idade, matricula);

        System.out.println("\nInformações do aluno:");
        aluno.exibirInformacoes();

        scanner.close();
    }
}