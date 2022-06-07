import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ChamadoDeSenha chamadoDeSenha = new ChamadoDeSenha();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int s = 1;
        while (opcao != 4) {
            System.out.println("1 - Criar senha");
            System.out.println("2 - Chamar senha");
            System.out.println("3 - Sair");
            System.out.println("Digite uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    Senha senha = new Senha(s);
                    chamadoDeSenha.criarSenha(senha);
                    s++;
                    break;
                case 2:
                    chamadoDeSenha.chamarSenha();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }        
    }
}
