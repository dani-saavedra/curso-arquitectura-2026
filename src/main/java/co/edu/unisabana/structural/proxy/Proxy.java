package co.edu.unisabana.structural.proxy;

public class Proxy implements Internet {

    Internet internet;

    public Proxy() {
        internet = new InternetImpl();
    }

    @Override
    public String navegar(String url) {
        if (url.contains("juego") || url.contains("noporn")) {
            throw new RuntimeException("Sitios no permitidos, será reportado");
        }
        return internet.navegar(url);
    }
}
