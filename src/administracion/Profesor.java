package administracion;

import java.util.ArrayList;

public class Profesor extends MiembroUnal{
    private boolean director;
    private Materia materiaEnsena;
    private ArrayList<Grupo> grupos;

    public Profesor(String correo, String nombre, String apellido, int edad, boolean director, Materia materiaEnsena, ArrayList<Grupo> grupos) {
        super(correo, nombre, apellido, edad);
        this.director = director;
        this.materiaEnsena = materiaEnsena;
        this.grupos = grupos;
    }

    public Profesor(String correo, String nombre, String apellido, int edad){
        super(correo, nombre, apellido, edad);
        this.materiaEnsena = null;
        this.director = false;
        this.grupos = new ArrayList<>();
    }



    @Override
    public String saludar() {
        return null;
    }



    public boolean isDirector() {
        return director;
    }

    public void setDirector(boolean director) {
        this.director = director;
    }

    public Materia getMateriaEnsena() {
        return materiaEnsena;
    }

    public void setMateriaEnsena(Materia materiaEnsena) {
        this.materiaEnsena = materiaEnsena;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }
}
