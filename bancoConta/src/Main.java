import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        GerenciarConta gc = new GerenciarConta();

        boolean bool = true;

        System.out.println("\tBem Vindo! \nBanco Generical - Gerenciamento");

        while (bool){

            Scanner var = new Scanner(System.in);
            
            System.out.println("\nSelecione uma das opções abaixo: \n1 - Adicionar conta \n2 - Remover Conta \n3 - Buscar Contas Especiais \n4 - Buscar Clientes Usando Limite \n5 - Buscar Conta \n6 - Transferir Valor \n7 - Depositar \n8 - Listar Contas \n0 - Sair do programa\n");
            
            int op = var.nextInt();

            

            if(op == 1){
                
                System.out.println("\nAdicionar uma Conta");
               
                Scanner v = new Scanner(System.in);
               
                System.out.println("\nEscolha o tipo da conta: \n1 - Conta Corrente \n2 - Conta Poupança \n3 - Conta Especial");
               
                int tipoConta = v.nextInt();

                

                if(tipoConta == 1){

                    System.out.println("Criar conta corrente ");

                    Scanner n =  new Scanner(System.in);

                    System.out.println("\nDigite o numero da conta: ");

                    int contaNumero = n.nextInt();

                    

                    Scanner cn =  new Scanner(System.in);

                    System.out.println("\nDigite o nome do cliente: ");

                    String nomeCliente = cn.nextLine();

                   

                    Scanner cp =  new Scanner(System.in);

                    System.out.println("\nDigite o CPF do cliente:  ");

                    String cpf = cp.nextLine();

                    

                    Scanner opc =  new Scanner(System.in);

                    System.out.println("\nDeseja adicionar um limite? \n1 - Sim \n2 - Não ");

                    int opcao = opc.nextInt();

                    

                    if(opcao == 1){

                        Scanner lim = new Scanner(System.in);

                        System.out.println("\nDigite um limite: ");

                        double limite = lim.nextDouble();

                       

                        ContaCorrente c = new ContaCorrente(contaNumero, nomeCliente, cpf,limite);

                        gc.adicionarConta(c);

                        System.out.println("\nConta Adicionada: \n" + c);
                        
                        bool = true;

        
                    }

                    
                    else{

                        ContaCorrente c = new ContaCorrente(contaNumero, nomeCliente, cpf);

                        gc.adicionarConta(c);
    
                        System.out.println("\nConta Adicionada: \n" + c);
    
                        bool = true;

                    }

                   

                }
                if(tipoConta == 2){

                    System.out.println("Criar conta poupança\n ");


                    Scanner n =  new Scanner(System.in);

                    System.out.println("\nDigite o numero da conta: ");

                    int contaNumero = n.nextInt();


                    Scanner cn =  new Scanner(System.in);

                    System.out.println("\nDigite o nome do cliente: ");

                    String nomeCliente = cn.nextLine();

                    

                    Scanner cp =  new Scanner(System.in);

                    System.out.println("\nDigite o CPF do cliente:  ");

                    String cpf = cp.nextLine();

                    

                    ContaPoupanca c = new ContaPoupanca(contaNumero, nomeCliente, cpf);

                    gc.adicionarConta(c);

                    System.out.println("\nConta Adicionada: \n" + c);

                    
                }


                
                if(tipoConta == 3){

                    System.out.println("Criar conta Especial ");

                    Scanner n =  new Scanner(System.in);

                    System.out.println("\nDigite o numero da conta: ");

                    int contaNumero = n.nextInt();

                   

                    Scanner cn =  new Scanner(System.in);

                    System.out.println("\nDigite o nome do cliente: ");

                    String nomeCliente = cn.nextLine();

                  

                    Scanner cp =  new Scanner(System.in);

                    System.out.println("\nDigite o CPF do cliente:  ");

                    String cpf = cp.nextLine();

                    

                    Scanner ng =  new Scanner(System.in);

                    System.out.println("\nDigite o nome do Gerente:  ");

                    String nomeDoGerenteResponsavel = ng.nextLine();

                    

                    Scanner opc =  new Scanner(System.in);

                    System.out.println("\nDeseja adicionar um limite? \n1 - Sim \n2 - Não ");

                    int opcao = opc.nextInt();

                    

                    if(opcao == 1){

                        Scanner lim = new Scanner(System.in);

                        System.out.println("\nDigite um limite: ");

                        double limite = lim.nextDouble();

                        

                        ContaEspecial c = new ContaEspecial(contaNumero, nomeCliente, cpf, nomeDoGerenteResponsavel, limite);

                        gc.adicionarConta(c);

                        System.out.println("\nConta Adicionada: \n" + c);
                        
                        bool = true;

        
                    }

                    else{

                        ContaEspecial c = new ContaEspecial(contaNumero, nomeCliente, cpf, nomeDoGerenteResponsavel);

                        gc.adicionarConta(c);
                        System.out.println("\nConta Adicionada: \n" + c);
                        bool = true;
                    }

                   
                    
                }


            }

            if(op == 2){

                int numeroConta = 0;

                Scanner nc = new Scanner(System.in);

                System.out.println("Digite o numero da Conta: ");     
                
                numeroConta = nc.nextInt();

                while(!gc.removerConta(numeroConta)){

                    Scanner na = new Scanner(System.in);

                    System.out.println("Digite o numero da Conta ou Digite 0 para sair: ");     
                
                    numeroConta = na.nextInt();

                    if(numeroConta == 0){
                        
                        bool = true;
                        break;
                    }

                    

                }

                
            }
            if(op == 3){

                System.out.println(gc.buscarContasEspeciais());
                
            }
            if(op == 4){

                System.out.println(gc.buscarClientesUsandoLimite());
                
            }
            if(op == 5){

                Scanner nc = new Scanner(System.in);

                System.out.println("Digite o numero da Conta: ");     
                
                int numeroConta = nc.nextInt();

                System.out.println(gc.buscarConta(numeroConta));
                
            }
            if(op == 6){

                Scanner nc = new Scanner(System.in);

                System.out.println("Digite o numero da Conta Fonte: ");     
                
                int numeroContaFonte = nc.nextInt();

                Scanner cd = new Scanner(System.in);

                System.out.println("Digite o numero da Conta Destino: ");     
                
                int numeroContaDestino = cd.nextInt();

                Scanner val = new Scanner(System.in);

                System.out.println("Digite o Valor: ");     
                
                int valor = val.nextInt();

                gc.transferirValor(numeroContaFonte, numeroContaDestino, valor);
                
            }
            if(op == 7){

                Scanner nc = new Scanner(System.in);

                System.out.println("Digite o numero da Conta: ");     
                
                int numeroConta = nc.nextInt();


                Scanner vd = new Scanner(System.in);

                System.out.println("Digite o Valor Depositado: ");     
                
                double valorDepositado = vd.nextInt();


                gc.depositar(numeroConta, valorDepositado);
                
            }

            if(op == 8){

                System.out.println(gc.listarContas());                

            }

            if(op == 0){
                System.out.println("\nSaindo do programa... \nObrigado por Usar!");
                bool = false;
                
            }


            


        }
        
    }

    
}
