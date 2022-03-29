package dio.gft.padroesProjeto.subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estavo) {
        System.out.println("Cliente salvo no sistema de CRM!");
        System.out.println("Cliente: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estavo);
    }

}