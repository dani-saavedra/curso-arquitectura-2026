package co.edu.unisabana.comportamiento.state;

public class EstadoRadicado implements State {

    @Override
    public void avanzarEstado(Pedido pedido) {
        //logica para radicar
        pedido.setEstado(null);
    }
}
