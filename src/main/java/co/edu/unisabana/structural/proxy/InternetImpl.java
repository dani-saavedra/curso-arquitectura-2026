package co.edu.unisabana.structural.proxy;


public class InternetImpl implements Internet {

    @Override
    public String navegar(String url) {
        return "Obtenido contenido de " + url;
    }
}
