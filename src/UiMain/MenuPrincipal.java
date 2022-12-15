package UiMain;

import java.util.Scanner;

public class MenuPrincipal {
    public static void Menu(){
        System.out.println("BIENVENIDO AL SIA");
        System.out.println();
        System.out.println("Que desea hacer en el dia de hoy?");
        String respuesta = "0";
        do{
            System.out.println("1. Hacer procedimiento de inscripción de materias a un estudiante");
            System.out.println("2. Generar lista de mejores promedios");
            System.out.println("3. Consultar una historia academica");
            System.out.println("4. Simular semestre");


            Scanner sc = new Scanner(System.in);
            respuesta = (String) sc.nextLine();
            switch (respuesta){
                case "1":
                    respuesta = "0";
                    break;

                case "2":
                    respuesta = "0";
                    MenuPromedios.mostrarMenuPromedios();
                    break;

                case "3":
                    respuesta = "0";
                    MenuConsultaHistoria.mostrarMenuConsulta();
                    break;

                case "4":
                    respuesta = "0";
                    break;

                default:
                    System.out.println("Por favor selecciona una de las opciones anteriormente indicadas");
            }


        }while (!respuesta.equals("0"));

    }

}
