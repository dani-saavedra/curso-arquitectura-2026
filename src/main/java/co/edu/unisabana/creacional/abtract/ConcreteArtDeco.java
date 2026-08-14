package co.edu.unisabana.creacional.abtract;

public class ConcreteArtDeco implements AbstractFactory {
    @Override
    public Silla crearSilla() {
        return new SillaArtDeco();
    }

    /*
    @Override
    public Sofa crearSofa() {
        return new SofaArtDeco();
    }

     */
}
