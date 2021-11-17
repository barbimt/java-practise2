import java.util.ArrayList;
import java.util.List;

public class ComboServicio extends Servicio{
    private double descuento;
    private List<Servicio> servicios = new ArrayList<>();

    public void addServicio(Servicio s){
        servicios.add(s);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    @Override
    public double calcularPrecio() {
        double total = 0.0;
        for (Servicio servicio : servicios) {
            total += servicio.calcularPrecio();
        }
        return total-(total*descuento);
    }

    @Override
    public String toString() {
        String servicioString = "";
        for (Servicio servicio : servicios) {
            servicioString = servicioString  + servicio.toString();
        }
        return "--Combo: " + getNombre() +
                " Descripción: " + getDescripcion() +
                "\n Servicios:" + servicioString +
                "--Precio total del combo:$ " + this.calcularPrecio();
    }

}
