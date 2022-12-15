package administracion;

import java.util.ArrayList;
import java.util.HashMap;

public class Grupo {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private int numeroGrupo;
    private HashMap<String,String> horario;

    public Grupo(ArrayList<Estudiante> estudiantes, int numeroGrupo, HashMap<String, String> horario) {
        this.estudiantes = estudiantes;
        this.numeroGrupo = numeroGrupo;
        this.horario = horario;
    }

    public Grupo(){

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


}
