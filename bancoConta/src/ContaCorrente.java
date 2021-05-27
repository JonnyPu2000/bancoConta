public class ContaCorrente extends Conta {

    private double limite;

    private double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaCorrente(int contaNumero, String nomeCliente, String string, double saldo, double limite) {
        super(contaNumero, nomeCliente, string, saldo);
        this.limite = limite;
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean sacar(double valorSacado){

        double saldo = getSaldo();

        if(saldo - valorSacado >= 0 - limite && saldo - valorSacado <= saldo){
            
            saldo -= valorSacado;
            setSaldo(saldo);
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

        return "Nome Cliente: " + getNomeCliente() +"\nCPF: "+ getCpf()+"\nConta: " +  getContaNumero() + "\nSaldo: "+ getSaldo() + "\nLimite: " + getLimite();


    }
    
}