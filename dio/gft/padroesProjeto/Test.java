package dio.gft.padroesProjeto;

import dio.gft.padroesProjeto.singletons.SingletonEager;
import dio.gft.padroesProjeto.singletons.SingletonLazy;
import dio.gft.padroesProjeto.singletons.SingletonLazyHolder;
import dio.gft.padroesProjeto.strategys.Comportament;
import dio.gft.padroesProjeto.strategys.ComportamentoDefensivo;
import dio.gft.padroesProjeto.strategys.ComportamentoNormal;
import dio.gft.padroesProjeto.strategys.ComportamentoOfensivo;
import dio.gft.padroesProjeto.strategys.Robo;

public class Test {
    public static void main(String[] args) {

//        sigletons
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

//        strategy
        Comportament defesa = new ComportamentoDefensivo();
        Comportament normal = new ComportamentoNormal();
        Comportament ataque = new ComportamentoOfensivo();

        Robo r = new Robo();
        r.setStrategy(defesa);
        r.mover();
        r.setStrategy(normal);
        r.mover();
        r.mover();
        r.setStrategy(ataque);
        r.mover();
        r.mover();
        r.mover();
    }

}
