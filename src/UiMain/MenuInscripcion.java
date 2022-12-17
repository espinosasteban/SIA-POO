package UiMain;

import administracion.Asignatura;
import administracion.Estudiante;
import administracion.Materia;

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
                    estudianteElegido.mostrarHistoria();
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

            if (estudiante.getPeriodoActual().getCantidadCreditos() <= 20){
                listaEstudiantes.add(estudiante);
            }
        }

        return listaEstudiantes;
    }

    private static boolean asignaturaCumplePrerrequisitos(Materia materiaPorInscribir, Estudiante estudiante){
        ArrayList<Asignatura> prerrequisitos = materiaPorInscribir.getPrerrequisitos();
        ArrayList<String> nombreMateriasVistas = new ArrayList<>();

        for(Asignatura asignatura: estudiante.getHistoriaAcademica().getAsignaturasVistas()){
            nombreMateriasVistas.add(asignatura.getNombre().toLowerCase());
            }

        for(Asignatura prerrequisito: prerrequisitos){
            if (!nombreMateriasVistas.contains(prerrequisito.getNombre())){
                return false;
            }

        }
        return true;
    }

    private static void mostrarMaterias(Estudiante estudiante){
        System.out.println("Las materias que el estudiante puede inscribir: ");

        ArrayList<Materia> materiasInscribibles = new ArrayList<>();

        for(Materia materia: Materia.materias){
            if(asignaturaCumplePrerrequisitos(materia, estudiante)){
                materiasInscribibles.add(materia);
            }
        }

        if (materiasInscribibles.size() == 0){
            System.out.println("Lo sentimos, no hay materias para inscribir a este estudiante");
        }
        else {
            int cantidadMateriasPorInscribir = 0;

        }



    }
}
