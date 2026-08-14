package co.edu.unisabana.creacional.abtract;

public class ConcreteVictoriana implements AbstractFactory {
    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }

    /*
    @Override
    public Sofa crearSofa() {
        return new SofaVictoriana();
    }

     */
}
