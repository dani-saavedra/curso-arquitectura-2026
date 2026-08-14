package co.edu.unisabana.comportamiento.state;

public class Pedido {
    private State estado;

    public Pedido() {
        this.estado = new EstadoRadicado();
    }

    public void avanzarPedido() {
        estado.avanzarEstado(this);
    }
    /*
    public void avanzarPedido() {
        if(this.estado.equals("Recibido")) {
            //logica para enviar al restaurante la notificacion
            this.estado = "Radicado_restaurante";
        }else if(this.estado.equals("Radicado_restaurante")) {
            //Logica para empezar a preparar la comida
            this.estado = "Preparacion";
        }else if(this.estado.equals("Preparacion")) {
            //Logica para despachar un pedido
            this.estado = "Despachado";
        }
    }

     */

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public State getEstado() {
        return estado;
    }
}
