package administracion;

import java.util.ArrayList;
//Esta clase es para cuando se va a inscribir una materia
public class Materia {
    private int cantidadCreditos;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private TIPO tipo;

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
}
