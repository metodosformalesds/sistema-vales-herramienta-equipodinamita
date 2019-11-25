package ElementosSistema;
public class Maquinarias {
    
    public Maquinarias(){
        
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumMaquina() {
        return numMaquina;
    }

    public void setNumMaquina(int numMaquina) {
        this.numMaquina = numMaquina;
    }
    
    private int numSerie;
    private String nombre;
    private int numMaquina;
    
}
