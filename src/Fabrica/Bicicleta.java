package Fabrica;

public abstract class Bicicleta {
    private Llanta llantaDelantera;
    private Llanta llantaTrasera;
    private float talla;
    private Marco marco;
    private FrenoHidraulico frenoDelantero;
    private FrenoHidraulico FrenoTrasero;

    public Bicicleta(Llanta llantaDelantera, Llanta llantaTrasera, float talla, Marco marco, FrenoHidraulico frenoDelantero, FrenoHidraulico frenoTrasero) {
        this.llantaDelantera = llantaDelantera;
        this.llantaTrasera = llantaTrasera;
        this.talla = talla;
        this.marco = marco;
        this.frenoDelantero = frenoDelantero;
        FrenoTrasero = frenoTrasero;
    }

    public Bicicleta(){

    }
}
