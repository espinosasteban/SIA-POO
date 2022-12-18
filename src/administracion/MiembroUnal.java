package administracion;

import java.util.ArrayList;

public abstract class MiembroUnal {
    private static ArrayList<MiembroUnal> miembrosUnal = new ArrayList<>();
    private String correo;
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;

    public MiembroUnal(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
        MiembroUnal.getMiembrosUnal().add(this);
    }

    public MiembroUnal(String correo) {
        this.correo = correo;
        MiembroUnal.getMiembrosUnal().add(this);
    }

    public MiembroUnal(String cedula, String nombre, String apellido){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public MiembroUnal(String correo, String nombre, String apellido, int edad) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        MiembroUnal.getMiembrosUnal().add(this);
    }



    public abstract String saludar();
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static ArrayList<MiembroUnal> getMiembrosUnal() {
        return miembrosUnal;
    }

    public static void setMiembrosUnal(ArrayList<MiembroUnal> miembrosUnal) {
        MiembroUnal.miembrosUnal = miembrosUnal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
