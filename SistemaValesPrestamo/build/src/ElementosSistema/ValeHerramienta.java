package ElementosSistema;
public class ValeHerramienta extends ValeGeneral{

    public ValeHerramienta() {
    }
    
    public void LlenarVale(String horaEntrada, String horaSalida, String fecha, 
            String docente, String clase, String practica, int idHerramienta, 
            String lab, String observaciones, int matEntrega, int matRecibe, 
            String status, String nombreSolicitante, int matriculaSolicitante) {
        
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.docente = docente;
        this.clase = clase;
        this.practica = practica;
        this.idHerramienta = idHerramienta;
        this.lab = lab;
        this.observaciones = observaciones;
        this.matEntrega = matEntrega;
        this.matRecibe = matRecibe;
        this.status = status;
        this.nombreSolicitante = nombreSolicitante;
        this.matriculaSolicitante = matriculaSolicitante;    
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getPractica() {
        return practica;
    }

    public void setPractica(String practica) {
        this.practica = practica;
    }

    public int getIdHerramienta() {
        return idHerramienta;
    }

    public void setIdHerramienta(int idHerramienta) {
        this.idHerramienta = idHerramienta;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    String clase; 
    String practica; 
    int idHerramienta;
    String lab; 
    String observaciones;
}
