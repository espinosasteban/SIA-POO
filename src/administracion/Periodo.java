package administracion;

import java.util.ArrayList;


//Esta clase puede pertenecer a un periodo que esté viendo o que ya haya visto
public class Periodo {
    private String semestre;
    private float promedio;
    private ArrayList<Asignatura> asignaturas;

    public Periodo(String semestre, float promedio, ArrayList<Asignatura> asignaturas) {
        this.semestre = semestre;
        this.promedio = promedio;
        this.asignaturas = asignaturas;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
