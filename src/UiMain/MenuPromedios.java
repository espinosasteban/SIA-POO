package UiMain;

import administracion.Estudiante;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class MenuPromedios {
    public static void mostrarMenuPromedios(){
        System.out.println("\nA continuacion se mostraran los 15 mejores promedios de la carrera de ingenieria de Sistemas");
        System.out.println("\nSi desea consultar la historia academica de cada uno de ellos, indique el numero del estudiante");


    }

    public static ArrayList<Estudiante> generarListaPromedios(){
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        HashMap<Estudiante, Float> estudiantesPromedios = new HashMap<>();
        LinkedHashMap<Estudiante, Float> mapaOrdenado = new LinkedHashMap<>();

        for(Estudiante estudiante: Estudiante.getArrayEstudiantes()){
            estudiantesPromedios.put(estudiante, estudiante.getHistoriaAcademica().getPAPA());
        }

        estudiantesPromedios.entrySet().stream().sorted
                (Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered
                        (x -> mapaOrdenado.put(x.getKey(), x.getValue()));

        Float promedioAnterior = 0f;

        for(Map.Entry<Estudiante, Float> tupla: mapaOrdenado.entrySet()){
            Estudiante estudianteActual = tupla.getKey();
            Float promedioActual = tupla.getValue();
            if(listaEstudiantes.size() >= 15 && promedioActual < promedioAnterior){
                break;
            }
            if(!listaEstudiantes.contains(estudianteActual)){
                if(listaEstudiantes.size() >= 15 && promedioActual == promedioAnterior){
                    listaEstudiantes.add(estudianteActual);
                } else if (listaEstudiantes.size() < 15) {
                    listaEstudiantes.add(estudianteActual);
                    promedioAnterior = promedioActual;
                }
            }

        }

        return listaEstudiantes;



    }
}
