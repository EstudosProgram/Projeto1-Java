import java.util.Scanner;

public class ContaBancaria {
public static void main(String[] args) {

    double saldoInicial = 1000;
    int escolhaOpcao;

    Scanner leitura  = new Scanner(System.in);

    System.out.println(
            """
            ********************************
            Dados iniciais do cliente:
            
            Nome:           Milena
            Tipo conta:     Corrente
            Saldo inicial:  R$ 1000,00
            
            ********************************
            
            
            Operações
            
            1- Consultar saldo
            2- Receber valor
            3- Transferir valor
            4- Sair
            
            Digite a opção desejada: """
    );
    escolhaOpcao = leitura.nextInt();



}
}
