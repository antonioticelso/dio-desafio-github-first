package dio.gft.padroesProjeto.strategys;

public class Robo {

    private Comportament strategy;

    public void setStrategy(Comportament strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();
    }

}
