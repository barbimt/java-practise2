public class ServicioFactory {

    private static ServicioFactory instance;

    private ServicioFactory(){};

    public static ServicioFactory getInstance(){
        if (instance==null){
            instance= new ServicioFactory();
        }
        return instance;
    }

    public Servicio crearServicio(String tipo){
        switch (tipo){
            case "Simple":
                return new ServicioSimple();
            case "Combo":
                return new ComboServicio();
            default:
                return null;
        }
    }
}
