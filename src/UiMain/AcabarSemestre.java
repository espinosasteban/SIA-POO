package UiMain;

import administracion.Asignatura;
import administracion.Estudiante;
import administracion.Grupo;
import administracion.Periodo;

import java.util.ArrayList;

public class AcabarSemestre {
    public static void terminarSemestre(){
        System.out.println("Acabando semestre para todos los estudiantes...");

        for (Estudiante estudiante: Estudiante.getArrayEstudiantes()){
            if(estudiante.getAsignaturasActuales().size() > 0 && estudiante.getPeriodoActual() != null){
                Periodo periodoActual = estudiante.getPeriodoActual();
                periodoActual.calcularPromedio();

                ArrayList<Asignatura> asignaturasActuales = estudiante.getAsignaturasActuales();
                ArrayList<Asignatura> asignaturasVistas = estudiante.getHistoriaAcademica().getAsignaturasVistas();
                asignaturasVistas.addAll(asignaturasActuales);
                estudiante.getHistoriaAcademica().setAsignaturasVistas(asignaturasVistas);


                estudiante.getHistoriaAcademica().getPeriodos().add(periodoActual);

                estudiante.getAsignaturasActuales().clear();
                estudiante.setCantidadMatriculas(estudiante.getCantidadMatriculas() + 1);

            }
        }
        for (Grupo grupo: Grupo.grupos){
            if (grupo.getEstudiantes().size() > 0){
                grupo.getEstudiantes().clear();
                grupo.getHorario().clear();
            }
        }

        System.out.println("Semestre terminado exitosamente");
    }
}
