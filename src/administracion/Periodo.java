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

    public Periodo(float promedio, ArrayList<Asignatura> asignaturas) {
        this.promedio = promedio;
        this.asignaturas = asignaturas;
    }

    public Periodo(String semestre, ArrayList<Asignatura> asignaturas) {
        this.semestre = semestre;
        this.asignaturas = asignaturas;
    }

    public String getSemestre() {
        return semestre;
    }

    public int getCantidadCreditos(){
        int totalCreditos = 0;
        if (getAsignaturas() != null){
            for(Asignatura asignaturaViendo: getAsignaturas()){
                totalCreditos += asignaturaViendo.getCantidadCreditos();

            }
        }
        return totalCreditos;
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

    public void calcularPromedio(){
        int creditos = 0;
        int creditosPorCalificacion = 0;
        for (Asignatura asignatura: asignaturas){
            creditos += asignatura.getCantidadCreditos();
            creditosPorCalificacion += asignatura.calcularDefinitiva() * asignatura.getCantidadCreditos();
        }

        setPromedio((float)creditosPorCalificacion / creditos);
    }
}
