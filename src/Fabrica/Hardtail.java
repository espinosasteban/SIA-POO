package Fabrica;

public class Hardtail extends Bicicleta{
    private Suspension suspension;

    public Hardtail(Llanta llantaDelantera, Llanta llantaTrasera, float talla, Marco marco, FrenoHidraulico frenoDelantero, FrenoHidraulico frenoTrasero, Suspension suspension) {
        super(llantaDelantera, llantaTrasera, talla, marco, frenoDelantero, frenoTrasero);
        this.suspension = suspension;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }
}
