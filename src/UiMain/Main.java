package UiMain;

import administracion.Estudiante;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inicializador.inicializar();
        ArrayList<Estudiante> estudiantesMejoresPromedios = MenuPromedios.generarListaPromedios();
        for (Estudiante estudiante: estudiantesMejoresPromedios){
            estudiante.mostrarHistoria();
        }
    }
}
