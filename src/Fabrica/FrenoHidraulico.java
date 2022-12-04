package Fabrica;

public class FrenoHidraulico extends Componente{
    private int tamanoRotor;
    private boolean necesitaSangrado;

    public FrenoHidraulico(int tamanoRotor, boolean necesitaSangrado) {
        this.tamanoRotor = tamanoRotor;
        this.necesitaSangrado = necesitaSangrado;
    }

    public int getTamanoRotor() {
        return tamanoRotor;
    }

    public void setTamanoRotor(int tamanoRotor) {
        this.tamanoRotor = tamanoRotor;
    }

    public boolean isNecesitaSangrado() {
        return necesitaSangrado;
    }

    public void setNecesitaSangrado(boolean necesitaSangrado) {
        this.necesitaSangrado = necesitaSangrado;
    }
}
