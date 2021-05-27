public class Main {
    public static void main(String[] args) throws Exception {

        GerenciarConta gc = new GerenciarConta();

        ContaCorrente cc = new ContaCorrente(525368, "Thiago Silas", "46765259821", 15000, 500);

        ContaCorrente ce = new ContaEspecial(521489, "Elianderson Silva", "89612349874", 2000, "Juliette Irineu", 200);

        ContaCorrente ce1 = new ContaEspecial(698741, "Nego Di da Silva", "89612349874", 20, "Rudney Neto", 100);

        gc.adicionarConta(cc);
        gc.adicionarConta(ce);
        gc.adicionarConta(ce1);

        System.out.println(gc.buscarContasEspeciais());
        System.out.println(gc.listarContas());

        
    }

    
}
