public class Test {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("BarbiCompany");

        Servicio carpinteria = ServicioFactory.getInstance().crearServicio("Simple");
        Servicio colocacion = ServicioFactory.getInstance().crearServicio("Simple");

        colocacion.setNombre("Colocación");
        colocacion.setDescripcion("Colocación de placas anti-humedad");
        ((ServicioSimple)colocacion).setPrecio(10000);

        carpinteria.setNombre("Carpinteria");
        carpinteria.setDescripcion("Carpinteria description");
        ((ServicioSimple)carpinteria).setPrecio(65000);

        Servicio combo = ServicioFactory.getInstance().crearServicio("Combo");
        combo.setNombre("Carpinteria + Colocación");
        combo.setDescripcion("Carpinteria y colocación - descripción");
        ((ComboServicio)combo).setDescuento(0.1);
        ((ComboServicio)combo).addServicio(carpinteria);
        ((ComboServicio)combo).addServicio(colocacion);

        empresa.addServicio(carpinteria);
        empresa.addServicio(colocacion);
        empresa.addServicio(combo);

        empresa.mostrarServicio();
    }

}
