public class Main {
    public static void main(String[] args) throws Exception {

        Conta conta = new ContaCorrente(55355432, "Alexandre Dias", "46765259821", 500.00, 150.00);

        conta.getNomeCliente();

        conta.sacar(650);

        System.out.println(conta.toString());
        
    }
}
