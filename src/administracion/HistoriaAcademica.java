package administracion;

import java.util.ArrayList;

public class HistoriaAcademica {
    private float PAPA;
    private int creditosFundOblg = 0;
    private int creditosDiscOblg = 0;
    private int creditosLibreEleccion = 0;
    private int creditosNivelacion = 0;
    private ArrayList<Asignatura> asignaturasVistas;
    private ArrayList<Periodo> periodos;

    public HistoriaAcademica(ArrayList<Asignatura> asignaturasVistas, ArrayList<Periodo> periodos) {

        this.asignaturasVistas = asignaturasVistas;
        this.periodos = periodos;
    }

    public HistoriaAcademica(){
        this.asignaturasVistas = new ArrayList<>();
        this.periodos = new ArrayList<>();
    }

    public void calcularPAPA() {
        int totalCreditos = 0;
        setCreditosDiscOblg(0);
        setCreditosFundOblg(0);
        setCreditosLibreEleccion(0);
        setCreditosNivelacion(0);


        float creditosPorCalificacion = 0;

        for (Asignatura asignaturaVista: asignaturasVistas){
            totalCreditos += asignaturaVista.getCantidadCreditos();
            creditosPorCalificacion += asignaturaVista.getCantidadCreditos() * asignaturaVista.calcularDefinitiva();
            if (asignaturaVista.getTipo() != null){
                if (asignaturaVista.getTipo().equals(TIPO.DISCIPLINAR_OBLIGATORIA)){

                    this.creditosDiscOblg += asignaturaVista.getCantidadCreditos();

                } else if (asignaturaVista.getTipo().equals(TIPO.NIVELACION)) {
                    this.creditosNivelacion += asignaturaVista.getCantidadCreditos();

                } else if (asignaturaVista.getTipo().equals(TIPO.FUND_OBLIGATORIA)) {
                    this.creditosFundOblg += asignaturaVista.getCantidadCreditos();

                } else if (asignaturaVista.getTipo().equals(TIPO.LIBRE_ELECCION)) {
                    this.creditosLibreEleccion += asignaturaVista.getCantidadCreditos();

                }
            }
        }

        setPAPA(creditosPorCalificacion / totalCreditos);
    }


    public ArrayList<Asignatura> getAsignaturasVistas() {
        return asignaturasVistas;
    }

    public void setAsignaturasVistas(ArrayList<Asignatura> asignaturasVistas) {
        this.asignaturasVistas = asignaturasVistas;
    }

    public ArrayList<Periodo> getPeriodos() {
        return periodos;
    }

    public void setPeriodos(ArrayList<Periodo> periodos) {
        this.periodos = periodos;
    }

    public int getCreditosFundOblg() {
        return creditosFundOblg;
    }

    public void setCreditosFundOblg(int creditosFundOblg) {
        this.creditosFundOblg = creditosFundOblg;
    }

    public int getCreditosDiscOblg() {
        return creditosDiscOblg;
    }

    public void setCreditosDiscOblg(int creditosDiscOblg) {
        this.creditosDiscOblg = creditosDiscOblg;
    }

    public int getCreditosLibreEleccion() {
        return creditosLibreEleccion;
    }

    public void setCreditosLibreEleccion(int creditosLibreEleccion) {
        this.creditosLibreEleccion = creditosLibreEleccion;
    }

    public int getCreditosNivelacion() {
        return creditosNivelacion;
    }

    public void setCreditosNivelacion(int creditosNivelacion) {
        this.creditosNivelacion = creditosNivelacion;
    }

    public float getPAPA() {
        return PAPA;
    }

    public void setPAPA(float PAPA) {
        this.PAPA = PAPA;
    }


}
