import java.util.Scanner;

public class Menu {
    public static void main(String[]args) {

        Conta conta= new Conta();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        conta.nome = scanner.nextLine();

        System.out.print("Digite o tipo da conta: ");
        conta.tipo = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        conta.saldo = scanner.nextDouble();
        conta.consultarSaldo();
        System.out.println("*****************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println("Nome:              "+conta.nome);
        System.out.println("Tipo de conta:     "+conta.tipo);
        System.out.println("Saldo inicial:     R$ "+conta.saldo);
        double saldo = 2500.00;
        System.out.println("*****************************************");
        int opcao=0;

        String menu= """
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        while (opcao!= 4) {
            System.out.println(menu);
            opcao= scanner.nextInt();
            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double valorReceber = scanner.nextDouble();
                    conta.receber(valorReceber);
                    break;
                case 3:
                    System.out.println("Informe o valor a ser transferido: ");
                    double valorTrasnferir= scanner.nextDouble();
                    conta.transferir(valorTrasnferir)   ;
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }


        }
    }
}