
package conta_bancaria;


public class ContaBancaria_Main {
    public static void main(String[] args) {
        
        Conta_Bancaria conta = new Conta_Bancaria("João Pedro", 12345, 1000.0f);

        conta.exibirDados();

        
        if (conta.sacar(200.0f)) {
            System.out.println("Saque de R$ 200,00 feito com sucesso!");
        } else {
            System.out.println("Saque não realizado. O Saldo é insuficiente, seja rico e tenha mais dinheiro na sua conta!");
        }

        
        conta.depositar(500.0f);
        System.out.println("O Depósito de R$ 500,00 foi realizado.");

        
        if (conta.sacar(2000.0f)) {
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saque não realizado. O Saldo é insuficiente, seja rico e tenha mais dinheiro na sua conta!");
        }

        conta.exibirDados();
    }
}