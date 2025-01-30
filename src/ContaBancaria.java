import java.util.Scanner;

public class ContaBancaria {
public static void main(String[] args) {

    String nome = "Milena";
    String conta = "Corrente";
    double saldo = 1000.00;
    int escolhaOpcao = 0;

    Scanner leitura = new Scanner(System.in);

    System.out.println("**************************************");
    System.out.println("\nNome do cliente: " + nome);
    System.out.println("Tipo de conta: " + conta);
    System.out.println("Saldo atual: " + saldo);
    System.out.println("\n**************************************");

    String menu = """ 
            \nOperações
            
            1- Consultar saldo
            2- Receber valor
            3- Transferir valor
            4- Sair
            
            Digite a opção desejada:""";


    while (escolhaOpcao != 4) {
        System.out.println(menu);
        escolhaOpcao = leitura.nextInt();

        if (escolhaOpcao == 1) {

            System.out.println("Seu saldo atual é: R$" + saldo);

        } else if (escolhaOpcao == 2) {

            System.out.println("Quanto é o valor que você vai receber?");
            double valorRecebido = leitura.nextDouble();
            saldo += valorRecebido;
            System.out.println("Seu saldo atualizado: R$" + saldo);

        } else if (escolhaOpcao == 3) {

            System.out.println("Digite o valor que queira transferir:");
            double valortransferido = leitura.nextDouble();

            if (valortransferido > saldo) {
                System.out.println("Você não tem saldo o suficiente para essa transferência");
            } else {
                saldo -= valortransferido;
                System.out.println("saldo atualizado: R$" + saldo);
            }

        } else if (escolhaOpcao != 4){

            System.out.println("Opção inválida!");

        } else {
            System.out.println("Fechando o banco...");
        }
    }
}
}
