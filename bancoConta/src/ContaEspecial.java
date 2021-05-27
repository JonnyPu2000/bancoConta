public class ContaEspecial extends ContaCorrente {

    private String nomeDoGerenteResponsavel;

    public ContaEspecial(int contaNumero, String nomeCliente, String string, double saldo, String nomeDoGerenteResponsavel) {
        
        super(contaNumero, nomeCliente, string, saldo);

        this.nomeDoGerenteResponsavel = nomeDoGerenteResponsavel;

    }

    public ContaEspecial(int contaNumero, String nomeCliente, String string, double saldo, String nomeDoGerenteResponsavel, int limite) {
        
        super(contaNumero, nomeCliente, string, saldo);

        this.nomeDoGerenteResponsavel = nomeDoGerenteResponsavel;

        this.limite = limite;
        
    }

    public String getNomeDoGerenteResponsavel() {
        return this.nomeDoGerenteResponsavel;
    }

    public void setNomeDoGerenteResponsavel(String nomeDoGerenteResponsavel) {
        this.nomeDoGerenteResponsavel = nomeDoGerenteResponsavel;
    };
    
    
}
