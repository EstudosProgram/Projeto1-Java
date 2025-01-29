import java.util.Scanner;

public class ContaBancaria {
public static void main(String[] args) {

    String nome = "Milena";
    String conta = "Corrente";
    double saldoInicial = 1000;
    int escolhaOpcao;

    Scanner leitura  = new Scanner(System.in);

    System.out.println("**************************************");
    System.out.println("\nNome do cliente: " + nome);
    System.out.println("Tipo de conta: " + conta);
    System.out.println("Saldo atual: " + saldoInicial);
    System.out.println("\n**************************************");

    System.out.println(""" 
            \nOperações
            
            1- Consultar saldo
            2- Receber valor
            3- Transferir valor
            4- Sair
            
            Digite a opção desejada:""");

    escolhaOpcao = leitura.nextInt();



}
}
