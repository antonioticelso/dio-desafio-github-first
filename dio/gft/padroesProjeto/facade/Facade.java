package dio.gft.padroesProjeto.facade;

import dio.gft.padroesProjeto.subsistema1.crm.CrmService;
import dio.gft.padroesProjeto.subsistema2.cep.CepApiervice;

public class Facade {

    public void migrarCliente(String nome, String cep) {

        String cidade = CepApiervice.getInstance().recuperarCidade(cep);
        String estavo = CepApiervice.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estavo);

    }

}