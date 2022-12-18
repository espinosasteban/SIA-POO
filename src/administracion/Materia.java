package administracion;

import java.util.ArrayList;
//Esta clase es para cuando se va a inscribir una materia
public class Materia {

    public static ArrayList<Materia> materias = new ArrayList<>();

    private String nombre;
    private int cantidadCreditos;
    private ArrayList<Profesor> profesores = new ArrayList<>();

    private ArrayList<Asignatura> prerrequisitos = new ArrayList<>();
    private TIPO tipo;

    public Materia(int cantidadCreditos, ArrayList<Profesor> profesores, ArrayList<Asignatura> prerrequisitos, TIPO tipo) {
        this.cantidadCreditos = cantidadCreditos;
        this.profesores = profesores;
        this.prerrequisitos = prerrequisitos;
        this.tipo = tipo;
        Materia.getMaterias().add(this);
    }

    public Materia(String nombre, int cantidadCreditos, ArrayList<Asignatura> prerrequisitos, TIPO tipo) {
        this.nombre = nombre;
        this.cantidadCreditos = cantidadCreditos;
        this.prerrequisitos = prerrequisitos;
        this.tipo = tipo;
        Materia.getMaterias().add(this);
    }

    public int getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(int cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public TIPO getTipo() {
        return tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Asignatura> getPrerrequisitos() {
        return prerrequisitos;
    }

    public void setPrerrequisitos(ArrayList<Asignatura> prerrequisitos) {
        this.prerrequisitos = prerrequisitos;
    }

    public static ArrayList<Materia> getMaterias() {
        return materias;
    }

    public static void setMaterias(ArrayList<Materia> materias) {
        Materia.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
