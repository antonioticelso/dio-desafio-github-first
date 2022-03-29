package dio.gft.padroesProjeto.subsistema2.cep;


public class CepApiervice {

    private static CepApiervice instance = new CepApiervice();

    private CepApiervice() {
        super();
    }

    public static CepApiervice getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Jundiai";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }

}