package administracion;

import java.util.ArrayList;
import java.util.HashMap;

public class Grupo {
    private String nombreAsignatura;
    public static ArrayList<Grupo> grupos = new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private int numeroGrupo;
    private HashMap<String,String> horario;

    public Grupo(ArrayList<Estudiante> estudiantes, int numeroGrupo, HashMap<String, String> horario) {
        this.estudiantes = estudiantes;
        this.numeroGrupo = numeroGrupo;
        this.horario = horario;
        Grupo.grupos.add(this);
    }

    public Grupo(String nombreAsignatura, ArrayList<Estudiante> estudiantes, int numeroGrupo) {
        this.nombreAsignatura = nombreAsignatura;
        this.estudiantes = estudiantes;
        this.numeroGrupo = numeroGrupo;
        Grupo.grupos.add(this);
    }

    public Grupo(String nombreAsignatura, ArrayList<Estudiante> estudiantes, int numeroGrupo, HashMap<String, String> horario) {
        this.nombreAsignatura = nombreAsignatura;
        this.estudiantes = estudiantes;
        this.numeroGrupo = numeroGrupo;
        this.horario = horario;
        Grupo.grupos.add(this);
    }

    public Grupo(){
        Grupo.grupos.add(this);

    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public HashMap<String, String> getHorario() {
        return horario;
    }

    public void inscribirEstudiante(Estudiante estudiante){
        this.getEstudiantes().add(estudiante);
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
}
