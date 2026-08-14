package co.edu.unisabana.creacional.abtract;

public class Decorador {

    /*
    public void decorar(String estilo) {
        if (estilo.equals("Victoriano")) {
            SillaVictoriana silla = new SillaVictoriana();
            SofaVictoriana sofa = new SofaVictoriana();
        } else if (estilo.equals("Art Deco")) {
            SillaArtDeco silla = new SillaArtDeco();
            SofaArtDeco sofa = new SofaArtDeco();
        }
    }

     */
    public void decorar(AbstractFactory factory) {
        Silla silla = factory.crearSilla();
       // Sofa sofa = factory.crearSofa();
    }
}
