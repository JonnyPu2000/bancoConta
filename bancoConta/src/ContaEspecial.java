public class ContaEspecial extends ContaCorrente {

    private String nomeDoGerenteResponsavel;

    public ContaEspecial(int contaNumero, String nomeCliente, String cpf,String nomeDoGerenteResponsavel) {
        
        super(contaNumero, nomeCliente, cpf);

        this.nomeDoGerenteResponsavel = nomeDoGerenteResponsavel;

    }

    public ContaEspecial(int contaNumero, String nomeCliente, String cpf, String nomeDoGerenteResponsavel, double limite) {
        
        super(contaNumero, nomeCliente, cpf);

        this.nomeDoGerenteResponsavel = nomeDoGerenteResponsavel;

        this.limite = limite;
        
    }

    public String getNomeDoGerenteResponsavel() {
        return this.nomeDoGerenteResponsavel;
    }

    public void setNomeDoGerenteResponsavel(String nomeDoGerenteResponsavel) {
        this.nomeDoGerenteResponsavel = nomeDoGerenteResponsavel;
    };

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



        return "\nNome Cliente: " + getNomeCliente() +"\nCPF: "+ cpf+"\nConta: " +  contaNumero + "\nSaldo: R$"+ getSaldo() + "\nLimite: R$" + getLimite() + "\nGerente: " + getNomeDoGerenteResponsavel() + "\n";
    }
    
    
}
