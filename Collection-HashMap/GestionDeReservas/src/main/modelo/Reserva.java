package main.modelo;

public class Reserva {
    private String id;
    private String fecha;
    private String reservante;

    public Reserva(String id, String fecha, String reservante) {
        this.id = id;
        this.fecha = fecha;
        this.reservante = reservante;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getReservante() {
        return reservante;
    }

    public void setReservante(String reservante) {
        this.reservante = reservante;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", reservante='" + reservante + '\'' +
                '}';
    }
}
