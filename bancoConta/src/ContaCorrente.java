public class ContaCorrente extends Conta {

    protected double limite = 0;

    protected double getLimite() {
        return this.limite;
    }

    protected void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaCorrente(int contaNumero, String nomeCliente, String cpf) {
        super(contaNumero, nomeCliente, cpf);
    }

    public ContaCorrente(int contaNumero, String nomeCliente, String cpf,double limite) {
        super(contaNumero, nomeCliente, cpf);
        this.limite = limite;
    }
    

    @Override
    public boolean sacar(double valorSacado){

        double saldo = getSaldo();

        if(saldo - valorSacado >= 0 - limite && saldo - valorSacado <= saldo){
            
            saldo -= valorSacado;
            setSaldo(saldo);

            if(getSaldo() < 0){
                setLimite(getSaldo() + limite);
            }
            return true;

        }

        System.out.println("Você não possui limite suficiente!");
        return false;



    }

    public boolean usandoLimite(){

        double saldo = getSaldo();

        if (saldo < 0 && saldo >= 0 -limite){
            return true;
        }
        return false;

    }

    @Override
    public String toString(){

        String cpf = getCpf();
        String bloco1 = cpf.substring(0, 3);
	    String bloco2 = cpf.substring(3, 6);
	    String bloco3 = cpf.substring(6, 9);
	    String bloco4 = cpf.substring(9, 11);
        cpf = bloco1 + "." + bloco2 + "." + bloco3 + "-" + bloco4;

        String contaNumero = "";
        contaNumero += getContaNumero();
        String block1 = contaNumero.substring(0,5);
        String block2 = contaNumero.substring(5,6);
        contaNumero = block1 + "-" + block2;

        return "\nNome Cliente: " + getNomeCliente() +"\nCPF: "+ cpf+"\nConta: " +  contaNumero + "\nSaldo: R$"+ getSaldo() + "\nLimite: R$" + getLimite() + "\n";


    }
    
}
