public class ContaPoupanca extends Conta {

    public ContaPoupanca(int contaNumero, String nomeCliente, String cpf, double saldo) {
        super(contaNumero, nomeCliente, cpf, saldo);
    }

    public void calcularRendimento(double porcentagemRendimento){
        
        if(porcentagemRendimento >= 0){
            double saldo = getSaldo();
            double porcentagemAumento = (100 + porcentagemRendimento)/100;
            saldo = saldo * porcentagemAumento;
        }
        else{
            System.out.println("Não é possivel ter Rendimento Negativo!");
        }

    }

    




    
}
