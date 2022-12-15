package UiMain;

import administracion.Estudiante;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class MenuPromedios {
    public static void mostrarMenuPromedios(){

        Scanner sc = new Scanner(System.in);



        ArrayList<Estudiante> estudiantesMejoresPromedios = MenuPromedios.generarListaPromedios();

        if (estudiantesMejoresPromedios.size() > 0){
            System.out.println("\nA continuacion se mostraran los 15 mejores promedios de la carrera de ingenieria de Sistemas");
            System.out.println("Si desea consultar la historia academica de cada uno de ellos, indique el numero del estudiante");
            int i = 1;
            for (Estudiante estudiante: estudiantesMejoresPromedios){
                System.out.println(i + ". " + estudiante.saludar() + " y mi PAPA es de " + estudiante.getHistoriaAcademica().getPAPA());
                i++;
            }
            int indice = 0;
            do {
                System.out.println("");
                System.out.println("Seleccione el estudiante");
                indice = Integer.parseInt(sc.nextLine());

                if (indice > estudiantesMejoresPromedios.size() || indice <= 0){
                    System.out.println("Seleccione uno valido");
                }
                else {
                    Estudiante estudianteElegido = estudiantesMejoresPromedios.get(indice-1);
                    estudianteElegido.mostrarHistoria();
                    System.out.println("Enter para continuar");
                    String enter = sc.nextLine();
                    MenuPrincipal.Menu();
                    break;
                }
            }while(indice > estudiantesMejoresPromedios.size() || indice <= 0);
        }else {
            System.out.println("Lo sentimos, todavia no hay informacion de mejores promedios");
        }


    }

    public static ArrayList<Estudiante> generarListaPromedios(){
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        HashMap<Estudiante, Float> estudiantesPromedios = new HashMap<>();
        LinkedHashMap<Estudiante, Float> mapaOrdenado = new LinkedHashMap<>();

        for(Estudiante estudiante: Estudiante.getArrayEstudiantes()){
            estudiantesPromedios.put(estudiante, estudiante.getHistoriaAcademica().calcularPAPA());
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
                if(listaEstudiantes.size() < 15){
                    listaEstudiantes.add(estudianteActual);
                    promedioAnterior = promedioActual;

                }
                else if (promedioActual.equals(promedioAnterior)) {
                    listaEstudiantes.add(estudianteActual);
                }
            }

        }

        return listaEstudiantes;



    }
}
