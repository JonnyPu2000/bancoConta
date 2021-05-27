public abstract class Conta {

    private int contaNumero;
    private String nomeCliente;
    private String cpf;
    private double saldo;

    public Conta(int contaNumero, String nomeCliente, String cpf){

        this.contaNumero = contaNumero;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.saldo = 0;

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
            System.out.println("Não é possivel Depositar um valor menor ou igual a zero!");
            return false;
        }

        this.saldo += valorDepositado;
        return true;
    }

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

        return "Nome Cliente: " + getNomeCliente() +"\nCPF: "+ cpf +"\nConta: " + contaNumero + "\nSaldo: R$"+ getSaldo() + "\n";

    }
    
}
