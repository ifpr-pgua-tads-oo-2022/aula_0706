public class Principal {
    
    public static void main(String[] args){

        ContaCorrente conta;

        conta = new ContaCorrente();

        conta.numeroDaConta = 200989;
        conta.agencia = 567;
        conta.saldo = 1000;
        conta.documento = "123-008";
        conta.ativa = false;
        conta.senha = "****";

        System.out.println("Numero:"+conta.numeroDaConta);
        System.out.println("Agencia:"+conta.agencia);
        System.out.println("Saldo R$:"+conta.saldo);
        System.out.println("Documento:"+conta.documento);
        System.out.println("Ativa:"+conta.ativa);
        System.out.println("Senha:"+conta.senha);

        double valor = 100;
        conta.depositar(valor);
        
        System.out.println("Saldo após deposito R$:"+conta.saldo);
        
        conta.sacar(500);
        System.out.println("Saldo após saque R$:"+conta.saldo);
        

    }

}
