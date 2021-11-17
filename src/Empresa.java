import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Servicio> servicios = new ArrayList<>();
    private String nombre;

    public Empresa(String nombre){
        this.nombre =  nombre;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addServicio(Servicio s){
        servicios.add(s);
    }

    public void mostrarServicio(){
        for (Servicio servicio: servicios) {
            System.out.println(servicio.toString() + "\n");
        }
    }


}
