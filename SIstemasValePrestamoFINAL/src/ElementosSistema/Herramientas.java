package ElementosSistema;
public class Herramientas {
    
    public Herramientas(){
        
    }

    public Herramientas(int numInventario, String nombre, String caracteristicas, int cantidad) {
        
        this.numInventario = numInventario;
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.cantidad = cantidad;
    }

    public int getNumInventario() {
        return numInventario;
    }

    public void setNumInventario(int numInventario) {
        this.numInventario = numInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    private int numInventario;
    private String nombre;
    private String caracteristicas;
    private int cantidad;
    
    
}
