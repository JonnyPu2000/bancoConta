public abstract class Conta {

    private int contaNumero;
    private String nomeCliente;
    private String cpf;
    private double saldo;

    public Conta(int contaNumero, String nomeCliente, String cpf, double saldo){

        this.contaNumero = contaNumero;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.saldo = saldo;

    }

    public int getContaNumero() {
        return this.contaNumero;
    }

    protected void setContaNumero(int contaNumero) {
        this.contaNumero = contaNumero;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return this.cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valorSacado){

        if (this.saldo >= valorSacado){
            this.saldo -= valorSacado;
            return true;
        }
        return false;
        
    }

    public boolean depositar(double valorDepositado){
        
        if(valorDepositado <= 0){
            return false;
        }

        this.saldo += valorDepositado;
        return true;
    }

    public String toString(){

        return "Nome Cliente: " + getNomeCliente() +"\nCPF: "+ getCpf() +"\nConta: " +  getContaNumero() + "\nSaldo: "+ getSaldo();

    }
    
}
