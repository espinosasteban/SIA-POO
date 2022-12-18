package administracion;

import java.util.ArrayList;
//Esta clase es la asignatura que ya tiene inscrita el estudiante
public class Asignatura {
    private String nombre;
    private TIPO tipo;
    private int cantidadCreditos;
    private Grupo grupo;
    private ArrayList<Trabajo> notas;

    public Asignatura(String nombre, int cantidadCreditos, Grupo grupo, ArrayList<Trabajo> notas, TIPO tipo) {
        this.nombre = nombre;
        this.cantidadCreditos = cantidadCreditos;
        this.grupo = grupo;
        this.notas = notas;
        this.tipo = tipo;
    }

    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura(String nombre, int cantidadCreditos) {
        this.nombre = nombre;
        this.cantidadCreditos = cantidadCreditos;
    }

    public Asignatura(String nombre, int cantidadCreditos, TIPO tipo) {
        this.nombre = nombre;
        this.cantidadCreditos = cantidadCreditos;
        this.tipo = tipo;
    }

    public int getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(int cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ArrayList<Trabajo> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Trabajo> notas) {
        this.notas = notas;
    }

    public float calcularDefinitiva(){
        float definitiva = 0;
        if (getNotas() != null){
            for (Trabajo trabajo: notas){
                float notaTrabajo = ((float)trabajo.getPorcentaje() / 100) * trabajo.getCalificacion();
                definitiva += notaTrabajo;
            }
            definitiva = (float)(Math.round(definitiva * 100.0) / 100.0);

        }
        return definitiva;
    }

    public TIPO getTipo() {
        return tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
