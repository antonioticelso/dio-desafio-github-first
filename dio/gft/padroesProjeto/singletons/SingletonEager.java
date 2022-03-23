package dio.gft.padroesProjeto.singletons;

/**
 * Singleton
 * @author Tonhao
 *
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}
