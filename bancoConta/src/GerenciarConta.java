import java.util.ArrayList;

public class GerenciarConta {

    public ArrayList<Conta> contas = new ArrayList<>();

    public GerenciarConta(){
        
        ArrayList<Conta> contas = new ArrayList<>();
                
    }

    public void adicionarConta(Conta c){

        contas.add(c);

    }

    public boolean removerConta(int numeroConta){

        for(Conta x : contas){

            if(x.getContaNumero() == numeroConta){

                contas.remove(x);
                return true;
            }

        }
        System.out.println("\nConta Inexistente!");
        return false;

    }

    public String buscarContasEspeciais(){

        String aux = "Contas Especiais\n";

        for(Conta ce : contas){
            
            if(ce instanceof ContaEspecial){

                aux = aux + ce.toString();
                
            }
        }
        return aux;
        
    }

    public String buscarClientesUsandoLimite(){

        String aux = "";

        for(Conta c : contas){

            if(c instanceof ContaCorrente || c instanceof ContaEspecial){
                ContaCorrente cc = (ContaCorrente) c;
                if(cc.usandoLimite()){

                    aux += cc.toString();

                }

            }
        }
        return aux;

    }
    
    public Conta buscarConta(int numeroConta){

        for(Conta x: contas){

            if(x.getContaNumero() == numeroConta){
                return x;
            }
        }
        return null;
    }

    public boolean transferirValor(int numeroContaFonte, int numeroContaDestino,double valor){

        Conta contaFonte = buscarConta(numeroContaFonte);
        Conta contaDestino = buscarConta(numeroContaDestino);

        if(contaFonte == null){
            System.out.println("Conta Fonte Inexistente");
            return false;
        }
        if(contaDestino == null){
            System.out.println("Conta Destino Inexistente");
            return false;
        }
        if(valor > contaFonte.getSaldo()){

            System.out.println("Saldo Insuficiente!");
            return false;
            
        }

        contaFonte.setSaldo(contaFonte.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        return true;
    }

    public boolean depositar(int numeroConta, double valorDepositado){

        Conta c = buscarConta(numeroConta);

        if(c == null){

            System.out.println("Conta N??o Encontrada");
            return false;
        }

        return c.depositar(valorDepositado);

    }

    public boolean sacar(int numeroConta, double valorSacado){

        Conta c = buscarConta(numeroConta);

        if(c == null){

            System.out.println("Conta N??o Encontrada");
            return false;
        }

        return c.sacar(valorSacado);

    }


    public String listarContas(){

        String aux = "";

        for(Conta c : contas){

            aux += c.toString();
        }

        return aux;

    }    
}
