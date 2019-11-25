package ElementosSistema;
public class ValeMaquinaria extends ValeGeneral{
    
    String condicionInicial;
    String condicionFinal;
    int idMaquinaria;
    
    
    public void LlenarVale(String horaEntrada, String horaSalida, String fecha, 
            String docente, String nombreSolicitante, int matSolicitante, 
            int matEntrega, int matRecibe, String estatus, String condicionInicial, 
            String condicionFinal, int idMaquinaria){
        
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.docente = docente;
        this.matEntrega = matEntrega;
        this.matRecibe = matRecibe;
        this.nombreSolicitante = nombreSolicitante;
        this.matriculaSolicitante = matSolicitante;
        this.status = estatus;
        this.condicionInicial = condicionInicial;
        this.condicionFinal = condicionFinal;
        this.idMaquinaria = idMaquinaria;
    }

    public String getCondicionInicial() {
        return condicionInicial;
    }

    public void setCondicionInicial(String condicionInicial) {
        this.condicionInicial = condicionInicial;
    }

    public String getCondicionFinal() {
        return condicionFinal;
    }

    public void setCondicionFinal(String condicionFinal) {
        this.condicionFinal = condicionFinal;
    }

    public int getIdMaquinaria() {
        return idMaquinaria;
    }

    public void setIdMaquinaria(int idMaquinaria) {
        this.idMaquinaria = idMaquinaria;
    }
    
    
}
