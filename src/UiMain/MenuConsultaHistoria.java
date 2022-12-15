package UiMain;

import administracion.Estudiante;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuConsultaHistoria {
    public static void mostrarMenuConsulta(){
        System.out.println("Bienvenido al menú de consulta de historias academicas");
        System.out.println("Escoja el filtro por el que desea buscar");

        Scanner sc = new Scanner(System.in);
        String respuesta = "0";
        
        do {
            System.out.println("0. Regresar");
            System.out.println("1. Correo");
            System.out.println("2. Nombre");
            System.out.println("3. Cedula");

            respuesta = (String) sc.nextLine();
            
            switch (respuesta){

                case "1":
                    respuesta = "0";
                    System.out.println("Por favor digite el correo del estudiante (no incluya el @unal.edu.co)");

                    String correo = sc.nextLine();


                    MenuConsultaHistoria.mostrarResultados("correo", correo);
                    
                case "2":
                    respuesta = "0";
                    System.out.println("Por favor digite el nombre del estudiante (puede ser también con el apellido)");
                    String nombre = sc.nextLine();
                    MenuConsultaHistoria.mostrarResultados("nombre", nombre);
                    
                case "3":
                    respuesta = "0";
                    String cedula = sc.nextLine();
                    MenuConsultaHistoria.mostrarResultados("cedula",cedula);

                case "0":
                    MenuPrincipal.Menu();



                default:
                    System.out.println("Ingresa una de las siguientes opciones");
            }
            
        }while (!respuesta.equals("0"));


    }

    private static void FiltroCedula() {

    }

    private static void FiltroNombre(String nombre) {


    }



    private static void mostrarResultados(String filtro, String busqueda) {
        ArrayList<Estudiante> listaEstudiantes = filtrarEstudiantes(filtro, busqueda.toLowerCase());
        int i = 1;

        if (listaEstudiantes.size() >= 1){
            System.out.println("Estos fueron los resultados: ");
            Scanner sc = new Scanner(System.in);
            for (Estudiante estudiante: listaEstudiantes){
                System.out.println(i + ". " + estudiante.saludar());
                i++;
            }
            int indice = 0;
            do {
                System.out.println("");
                System.out.println("Seleccione el estudiante");
                indice = Integer.parseInt(sc.nextLine());

                if (indice > listaEstudiantes.size() || indice <= 0){
                    System.out.println("Seleccione uno valido");
                }
                else {
                    System.out.println("Hola");
                    Estudiante estudianteElegido = listaEstudiantes.get(indice-1);
                    estudianteElegido.mostrarHistoria();
                    System.out.println("Enter para continuar");
                    String enter = sc.nextLine();
                    MenuPrincipal.Menu();
                    break;
                }
            }while(indice > listaEstudiantes.size() || indice <= 0);

        }
        else {
            System.out.println("Lo sentimos, no hay estudiantes todavía");
            MenuConsultaHistoria.mostrarMenuConsulta();
        }

    }


    private static ArrayList<Estudiante> filtrarEstudiantes(String filtro, String busqueda){
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        ArrayList<Estudiante> arrayEstudiantes = Estudiante.getArrayEstudiantes();

        switch (filtro){
            case "correo":
                for (Estudiante estudiante: arrayEstudiantes){
                    if (estudiante.getCorreo().toLowerCase().contains(busqueda)){
                        listaEstudiantes.add(estudiante);
                    }
                }
                break;

            case "cedula":
                for (Estudiante estudiante: arrayEstudiantes){

                    if (estudiante.getCedula().toLowerCase().contains(busqueda)){
                        listaEstudiantes.add(estudiante);
                    }
                }

            case "nombre":
                for (Estudiante estudiante: arrayEstudiantes){
                    if ((estudiante.getCorreo() + " " + estudiante.getApellido()).contains(busqueda)){
                        listaEstudiantes.add(estudiante);
                    }
                }

        }

        return listaEstudiantes;
    }






}
