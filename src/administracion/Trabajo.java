package administracion;

public class Trabajo {
    private int porcentaje;
    private float calificacion;
    private String descripcion;

    public Trabajo(int porcentaje, float calificacion, String descripcion) {
        this.porcentaje = porcentaje;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
    }

    public Trabajo(int porcentaje, float calificacion){
        this(porcentaje, calificacion, "No hay descripción para este trabajo");
    }

    public Trabajo(){
        this(0, 0, "No hay descripción para este trabajo");
    }

    public String mostrarResumen(){
        return "Trabajo que valia el " + getPorcentaje() + " de la materia, donde la calificación fue de " + getCalificacion();
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
