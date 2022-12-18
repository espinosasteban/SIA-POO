package UiMain;

import administracion.Asignatura;
import administracion.Estudiante;
import administracion.Materia;
import administracion.Periodo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuInscripcion {
    public static void mostrarInscribir() {
        System.out.println("Bienvenido al menu de inscripcion de materias a un estudiante");

        ArrayList<Estudiante> listaEstudiantes = MenuInscripcion.listaEstudiantesInscribibles();

        System.out.println("Los siguientes fueron los estudiantes que tienen menos de 20 creditos inscritos");
        int i = 1;

        if (listaEstudiantes.size() >= 1) {
            System.out.println("Estos fueron los resultados: ");
            Scanner sc = new Scanner(System.in);
            for (Estudiante estudiante : listaEstudiantes) {
                System.out.println(i + ". " + estudiante.saludar());
                i++;
            }
            int indice = 0;
            do {
                System.out.println("");
                System.out.println("Seleccione el estudiante");
                indice = Integer.parseInt(sc.nextLine());

                if (indice > listaEstudiantes.size() || indice <= 0 ) {
                    System.out.println("Seleccione uno valido");
                }


                else {
                    Estudiante estudianteElegido = listaEstudiantes.get(indice - 1);
                    estudianteElegido.saludar();
                    mostrarMaterias(estudianteElegido);
                    System.out.println("Enter para continuar");
                    String enter = sc.nextLine();
                    MenuPrincipal.Menu();
                    break;
                }
            } while (indice > listaEstudiantes.size() || indice <= 0);
        }
    }





    private static ArrayList<Estudiante> listaEstudiantesInscribibles(){
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        for(Estudiante estudiante: Estudiante.getArrayEstudiantes()){
            if (estudiante.getPeriodoActual() == null){
                estudiante.setPeriodoActual(new Periodo("2022-2S"));
            }
            if (estudiante.getPeriodoActual().getCantidadCreditos() <= 20){
                listaEstudiantes.add(estudiante);
            }
        }

        return listaEstudiantes;
    }

    private static boolean asignaturaCumplePrerrequisitos(Materia materiaPorInscribir, Estudiante estudiante){
        ArrayList<Asignatura> prerrequisitos = materiaPorInscribir.getPrerrequisitos();
        ArrayList<String> nombreMateriasVistas = new ArrayList<>();

        if (prerrequisitos.size() == 0){
            return true;
        }
        else {
            for(Asignatura asignatura: estudiante.getHistoriaAcademica().getAsignaturasVistas()){
                nombreMateriasVistas.add(asignatura.getNombre());
            }

            for(Asignatura prerrequisito: prerrequisitos){
                if (!nombreMateriasVistas.contains(prerrequisito.getNombre())){
                    return false;
                }

            }

        }
        return true;
    }

    private static void mostrarMaterias(Estudiante estudiante){
        System.out.println("Las materias que el estudiante puede inscribir: ");

        ArrayList<Materia> materiasInscribibles = new ArrayList<>();

        for(Materia materia: Materia.getMaterias()){
            if(asignaturaCumplePrerrequisitos(materia, estudiante)){
                materiasInscribibles.add(materia);
            }
        }

        if (materiasInscribibles.size() == 0){
            System.out.println("Lo sentimos, no hay materias para inscribir a este estudiante");
        }
        else {
            int k = 1;
            for(Materia materia: materiasInscribibles){
                System.out.println(k + ". " + materia.getNombre() + " Creditos: " + materia.getCantidadCreditos());
                k++;
            }
            inscribirMaterias(estudiante, materiasInscribibles);


        }

    }

    private static void inscribirMaterias(Estudiante estudiante, ArrayList<Materia> materiasInscribibles){
        Scanner sc = new Scanner(System.in);

        System.out.println("Actualmente esta viendo " + estudiante.getPeriodoActual().getCantidadCreditos() + "\n");
        System.out.println("Tenga en cuenta que no puede ver mas de 20 creditos");

        System.out.println("A continuacion digite el tope de creditos que desea inscribir");
        int topeDeCreditos = Integer.parseInt(sc.nextLine());
        do {
            if (topeDeCreditos > 20){
                System.out.println("No puede ver esa cantidad de creditos");
            }
            else{
                int indice = 0;
                do {
                    System.out.println("");
                    System.out.println("Seleccione la materia");
                    indice = Integer.parseInt(sc.nextLine());
                    if (indice > materiasInscribibles.size() || indice <= 0){
                        System.out.println("Seleccione una valida");
                    }
                    else {
                        Materia materiaPorInscribir = materiasInscribibles.get(indice-1);
                        Asignatura asignaturaPorInscribir = new Asignatura(materiaPorInscribir.getNombre(), materiaPorInscribir.getCantidadCreditos(), materiaPorInscribir.getTipo());
                        estudiante.getPeriodoActual().getAsignaturas().add(asignaturaPorInscribir);
                        estudiante.getAsignaturasActuales().add(asignaturaPorInscribir);
                        System.out.println(materiaPorInscribir.getNombre() + " inscrita exitosamente!");
                        break;
                    }
                }while (indice > materiasInscribibles.size() || indice <= 0);
            }

        }while (estudiante.getPeriodoActual().getCantidadCreditos() < topeDeCreditos);






    }
}
