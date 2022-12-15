package UiMain;

import administracion.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Inicializador {
    public static void inicializar(){
        //Creación de estudiantes
        /*
        ArrayList<Estudiante> estudiantesPrueba = new ArrayList<>();
        Estudiante estudiante1 = new Estudiante("yormansito@unal.edu.co","Yorman","Carmona", 18);
        Estudiante estudiante2 = new Estudiante("esespinosap@unal.edu.co","Esteban","Espinosa",20);
        Estudiante estudiante3 = new Estudiante("mateozame@unal.edu.co","Mateo","Zapata",22);

        estudiantesPrueba.add(estudiante1);
        estudiantesPrueba.add(estudiante2);
        estudiantesPrueba.add(estudiante3);

        //Creacion de trabajos

        Trabajo trabajoPOO1 = new Trabajo(20,3.8f);
        Trabajo trabajoPOO2 = new Trabajo(25,5);
        Trabajo trabajoPOO3 = new Trabajo(25,4.7f);
        Trabajo trabajoPOO4 = new Trabajo(30,5);
        ArrayList<Trabajo> notasPOO = new ArrayList<>();
        notasPOO.add(trabajoPOO1);
        notasPOO.add(trabajoPOO2);
        notasPOO.add(trabajoPOO3);
        notasPOO.add(trabajoPOO4);

        Trabajo TLP1 = new Trabajo(15,4);
        Trabajo TLP2 = new Trabajo(15,4);
        Trabajo TLP3 = new Trabajo(15,4.5f);
        Trabajo TLP4 = new Trabajo(15,3.5f);
        Trabajo TLP5 = new Trabajo(20,5);
        Trabajo TLP6 = new Trabajo(20,4.1f);
        ArrayList<Trabajo> notasTLP = new ArrayList<>();
        notasTLP.add(TLP1);
        notasTLP.add(TLP2);
        notasTLP.add(TLP3);
        notasTLP.add(TLP4);
        notasTLP.add(TLP5);
        notasTLP.add(TLP6);

        //Creacion de asignaturas

        //POO
        HashMap<String, String> horarioPOO = new HashMap<>();
        horarioPOO.put("Martes","16:00");
        horarioPOO.put("Jueves", "14:00");
        Asignatura POO = new Asignatura("POO",3, new Grupo(estudiantesPrueba, 3, horarioPOO),notasPOO, TIPO.FUND_OBLIGATORIA);

        //TLP

        HashMap<String,String> horarioTLP = new HashMap<>();
        horarioTLP.put("Miercoles", "8:00");
        horarioTLP.put("Viernes","10:00");
        Asignatura TLP = new Asignatura("TLP",3, new Grupo(estudiantesPrueba, 4, horarioTLP),notasTLP, TIPO.FUND_OBLIGATORIA);

        estudiante1.getHistoriaAcademica().getAsignaturasVistas().add(POO);
        estudiante1.getHistoriaAcademica().getAsignaturasVistas().add(TLP);
        */

        Estudiante estudiante1 = new Estudiante("aaa@unal.edu.co","Nombre1","Apellido1", 20);
        Estudiante estudiante2 = new Estudiante("aaa@unal.edu.co","Nombre2","Apellido2", 20);
        Estudiante estudiante3 = new Estudiante("aaa@unal.edu.co","Nombre3","Apellido3", 20);
        Estudiante estudiante4 = new Estudiante("aaa@unal.edu.co","Nombre4","Apellido4", 20);
        Estudiante estudiante5 = new Estudiante("aaa@unal.edu.co","Nombre5","Apellido5", 20);
        Estudiante estudiante6 = new Estudiante("aaa@unal.edu.co","Nombre6","Apellido6", 20);
        Estudiante estudiante7 = new Estudiante("aaa@unal.edu.co","Nombre7","Apellido7", 20);
        Estudiante estudiante8 = new Estudiante("aaa@unal.edu.co","Nombre8","Apellido8", 20);
        Estudiante estudiante9 = new Estudiante("aaa@unal.edu.co","Nombre9","Apellido9", 20);
        Estudiante estudiante10 = new Estudiante("aaa@unal.edu.co","Nombr10","Apellido10", 20);
        Estudiante estudiante11 = new Estudiante("aaa@unal.edu.co","Nombre11","Apellido11", 20);
        Estudiante estudiante12 = new Estudiante("aaa@unal.edu.co","Nombre12","Apellido12", 20);
        Estudiante estudiante13 = new Estudiante("aaa@unal.edu.co","Nombre13","Apellido13", 20);
        Estudiante estudiante14 = new Estudiante("aaa@unal.edu.co","Nombre14","Apellido14", 20);
        Estudiante estudiante15 = new Estudiante("aaa@unal.edu.co","Nombre15","Apellido15", 20);
        Estudiante estudiante16 = new Estudiante("aaa@unal.edu.co","Nombre16","Apellido16", 20);
        Estudiante estudiante17 = new Estudiante("aaa@unal.edu.co","Nombre17","Apellido17", 20);
        Estudiante estudiante18 = new Estudiante("aaa@unal.edu.co","Nombre18","Apellido18", 20);

        Trabajo trabajo1 = new Trabajo(100,4);
        ArrayList<Trabajo> notas1 = new ArrayList<>();
        notas1.add(trabajo1);
        Asignatura asignaturaPrueba1 = new Asignatura("Asignatura1",3,new Grupo(),notas1,TIPO.FUND_OBLIGATORIA);
        estudiante1.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba1);

        Trabajo trabajo2 = new Trabajo(100,4.1f);
        ArrayList<Trabajo> notas2 = new ArrayList<>();
        notas2.add(trabajo2);
        Asignatura asignaturaPrueba2 = new Asignatura("Asignatura2",3,new Grupo(),notas2,TIPO.FUND_OBLIGATORIA);
        estudiante2.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba2);

        Trabajo trabajo3 = new Trabajo(100,4.2f);
        ArrayList<Trabajo> notas3 = new ArrayList<>();
        notas3.add(trabajo3);
        Asignatura asignaturaPrueba3 = new Asignatura("Asignatura3",3,new Grupo(),notas3,TIPO.FUND_OBLIGATORIA);
        estudiante3.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba3);

        Trabajo trabajo4 = new Trabajo(100,4.3f);
        ArrayList<Trabajo> notas4 = new ArrayList<>();
        notas4.add(trabajo4);
        Asignatura asignaturaPrueba4 = new Asignatura("Asignatura4",3,new Grupo(),notas4,TIPO.FUND_OBLIGATORIA);
        estudiante4.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba4);

        Trabajo trabajo5 = new Trabajo(100,5);
        ArrayList<Trabajo> notas5 = new ArrayList<>();
        notas5.add(trabajo5);
        Asignatura asignaturaPrueba5 = new Asignatura("Asignatura5",3,new Grupo(),notas5,TIPO.FUND_OBLIGATORIA);
        estudiante5.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba5);

        Trabajo trabajo6 = new Trabajo(100,5);
        ArrayList<Trabajo> notas6 = new ArrayList<>();
        notas6.add(trabajo6);
        Asignatura asignaturaPrueba6 = new Asignatura("Asignatura6",3,new Grupo(),notas6,TIPO.FUND_OBLIGATORIA);
        estudiante6.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba6);

        Trabajo trabajo7 = new Trabajo(100,5);
        ArrayList<Trabajo> notas7 = new ArrayList<>();
        notas7.add(trabajo7);
        Asignatura asignaturaPrueba7 = new Asignatura("Asignatura7",3,new Grupo(),notas7,TIPO.FUND_OBLIGATORIA);
        estudiante7.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba7);

        Trabajo trabajo8 = new Trabajo(100,3);
        ArrayList<Trabajo> notas8 = new ArrayList<>();
        notas8.add(trabajo8);
        Asignatura asignaturaPrueba8 = new Asignatura("Asignatura8",3,new Grupo(),notas8,TIPO.FUND_OBLIGATORIA);
        estudiante8.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba8);

        Trabajo trabajo9 = new Trabajo(100,4.1f);
        ArrayList<Trabajo> notas9 = new ArrayList<>();
        notas9.add(trabajo9);
        Asignatura asignaturaPrueba9 = new Asignatura("Asignatura9",3,new Grupo(),notas9,TIPO.FUND_OBLIGATORIA);
        estudiante9.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba9);

        Trabajo trabajo10 = new Trabajo(100,4.5f);
        ArrayList<Trabajo> notas10 = new ArrayList<>();
        notas10.add(trabajo10);
        Asignatura asignaturaPrueba10 = new Asignatura("Asignatura10",3,new Grupo(),notas10,TIPO.FUND_OBLIGATORIA);
        estudiante10.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba10);

        Trabajo trabajo11 = new Trabajo(100,4.6f);
        ArrayList<Trabajo> notas11 = new ArrayList<>();
        notas11.add(trabajo11);
        Asignatura asignaturaPrueba11 = new Asignatura("Asignatura11",3,new Grupo(),notas11,TIPO.FUND_OBLIGATORIA);
        estudiante11.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba11);

        Trabajo trabajo12 = new Trabajo(100,4.7f);
        ArrayList<Trabajo> notas12 = new ArrayList<>();
        notas12.add(trabajo12);
        Asignatura asignaturaPrueba12 = new Asignatura("Asignatura12",3,new Grupo(),notas12,TIPO.FUND_OBLIGATORIA);
        estudiante12.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba12);

        Trabajo trabajo13 = new Trabajo(100,4.8f);
        ArrayList<Trabajo> notas13 = new ArrayList<>();
        notas13.add(trabajo13);
        Asignatura asignaturaPrueba13 = new Asignatura("Asignatura13",3,new Grupo(),notas13,TIPO.FUND_OBLIGATORIA);
        estudiante13.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba13);

        Trabajo trabajo14 = new Trabajo(100,4.8f);
        ArrayList<Trabajo> notas14 = new ArrayList<>();
        notas14.add(trabajo14);
        Asignatura asignaturaPrueba14 = new Asignatura("Asignatura14",3,new Grupo(),notas14,TIPO.FUND_OBLIGATORIA);
        estudiante14.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba14);

        Trabajo trabajo15 = new Trabajo(100,5);
        ArrayList<Trabajo> notas15 = new ArrayList<>();
        notas15.add(trabajo15);
        Asignatura asignaturaPrueba15 = new Asignatura("Asignatura15",3,new Grupo(),notas15,TIPO.FUND_OBLIGATORIA);
        estudiante15.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba15);

        Trabajo trabajo16 = new Trabajo(100,5);
        ArrayList<Trabajo> notas16 = new ArrayList<>();
        notas16.add(trabajo16);
        Asignatura asignaturaPrueba16 = new Asignatura("Asignatura16",3,new Grupo(),notas16,TIPO.FUND_OBLIGATORIA);
        estudiante16.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba16);


        Trabajo trabajo17 = new Trabajo(100,5);
        ArrayList<Trabajo> notas17 = new ArrayList<>();
        notas17.add(trabajo17);
        Asignatura asignaturaPrueba17 = new Asignatura("Asignatura16",3,new Grupo(),notas17,TIPO.FUND_OBLIGATORIA);
        estudiante17.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba17);

        Trabajo trabajo18 = new Trabajo(100,4.1f);
        ArrayList<Trabajo> notas18 = new ArrayList<>();
        notas18.add(trabajo18);
        Asignatura asignaturaPrueba18 = new Asignatura("Asignatura16",3,new Grupo(),notas18,TIPO.FUND_OBLIGATORIA);
        estudiante18.getHistoriaAcademica().getAsignaturasVistas().add(asignaturaPrueba18);
    }





}
