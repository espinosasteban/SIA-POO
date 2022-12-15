package administracion;

import java.util.ArrayList;

public class Estudiante extends MiembroUnal{

    private static ArrayList<Estudiante> arrayEstudiantes = new ArrayList<>();
    private int cantidadMatriculas;
    private int reservasDeCupo;
    private HistoriaAcademica historiaAcademica;

    private ArrayList<Asignatura> asignaturasActuales;

    public Estudiante(String correo, String nombre, String apellido, int edad, int cantidadMatriculas, int reservasDeCupo, HistoriaAcademica historiaAcademica) {
        super(correo, nombre, apellido, edad);
        this.cantidadMatriculas = cantidadMatriculas;
        this.reservasDeCupo = reservasDeCupo;
        this.historiaAcademica = historiaAcademica;
        this.asignaturasActuales = new ArrayList<>();
        this.historiaAcademica = new HistoriaAcademica();
        Estudiante.getArrayEstudiantes().add(this);
    }

    public Estudiante(String correo, String nombre, String apellido, int edad){
        super(correo, nombre, apellido, edad);
        this.cantidadMatriculas = 0;
        this.reservasDeCupo = 3;
        this.historiaAcademica = new HistoriaAcademica();
        this.asignaturasActuales = new ArrayList<>();
        Estudiante.getArrayEstudiantes().add(this);
    }

    public Estudiante(String correo){
        super(correo);
        this.asignaturasActuales = new ArrayList<>();
        this.historiaAcademica = new HistoriaAcademica();
        Estudiante.getArrayEstudiantes().add(this);
    }

    public Estudiante(String cedula, String nombre, String apellido){
        super(cedula, nombre, apellido);
        this.historiaAcademica = new HistoriaAcademica();
        this.asignaturasActuales = new ArrayList<>();
        Estudiante.getArrayEstudiantes().add(this);
    }

    @Override
    public String saludar() {
        return "Me llamo " + getNombre() + " " + getApellido() + " y soy estudiante de Ingenieria de sistemas. Mi correo es " + getCorreo();
    }

    public int getCantidadMatriculas() {
        return cantidadMatriculas;
    }

    public int getReservasDeCupo() {
        return reservasDeCupo;
    }

    public HistoriaAcademica getHistoriaAcademica() {
        return historiaAcademica;
    }

    public static ArrayList<Estudiante> getArrayEstudiantes() {
        return arrayEstudiantes;
    }

    public static void setArrayEstudiantes(ArrayList<Estudiante> arrayEstudiantes) {
        Estudiante.arrayEstudiantes = arrayEstudiantes;
    }

    public ArrayList<Asignatura> getAsignaturasActuales() {
        return asignaturasActuales;
    }

    public void setAsignaturasActuales(ArrayList<Asignatura> asignaturasActuales) {
        this.asignaturasActuales = asignaturasActuales;
    }

    public void agregarAsignatura(Asignatura asignatura){
        getAsignaturasActuales().add(asignatura);

    }



    public void mostrarHistoria(){
        System.out.println("Historia academica de: ");
        System.out.println("\n");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Cedula: " + getCedula());
        System.out.println("PAPA: " + getHistoriaAcademica().calcularPAPA());

        System.out.println("RESUMEN DE ASIGNATURAS\n");
        for(Asignatura asignaturaVista: getHistoriaAcademica().getAsignaturasVistas()){
            System.out.println("Nombre: " + asignaturaVista.getNombre() + "\t\t\tNota: " + asignaturaVista.calcularDefinitiva() +
                    "\t\t\tCOMPONENTE: " + asignaturaVista.getTipo());
        }

        System.out.println("\nCreditos de DISCIPLINAR OBLIGATORIA: " + getHistoriaAcademica().getCreditosDiscOblg());
        System.out.println("Creditos de FUND. OBLIGATORIA: " + getHistoriaAcademica().getCreditosFundOblg());
        System.out.println("Creditos de LIBRE ELECCION: " + getHistoriaAcademica().getCreditosLibreEleccion());
        System.out.println("Creditos de NIVELACION: " + getHistoriaAcademica().getCreditosNivelacion());



    }
}
