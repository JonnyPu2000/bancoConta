public class ContaPoupanca extends Conta {

    public ContaPoupanca(int contaNumero, String nomeCliente, String cpf) {
        super(contaNumero, nomeCliente, cpf);
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
