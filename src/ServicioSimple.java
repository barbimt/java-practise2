public class ServicioSimple extends Servicio {
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        if (getNombre().equals("Colocación")) {
            return precio*1.1;
        }else {
            return precio;
        }
    }

    @Override
    public String toString() {
        return  "\n Servicio Simple: " + getNombre() +
                "\n Descripción: " + getDescripcion() +
                "\n Precio: $ " +  calcularPrecio() + "\n";
    }
}
