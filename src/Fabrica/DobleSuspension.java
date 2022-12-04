package Fabrica;

public class DobleSuspension extends Bicicleta{
    private Suspension suspensionDelantera;
    private Suspension suspensionTrasera;

    public DobleSuspension(Llanta llantaDelantera, Llanta llantaTrasera, float talla, Marco marco, FrenoHidraulico frenoDelantero, FrenoHidraulico frenoTrasero, Suspension suspensionDelantera, Suspension suspensionTrasera) {
        super(llantaDelantera, llantaTrasera, talla, marco, frenoDelantero, frenoTrasero);
        this.suspensionDelantera = suspensionDelantera;
        this.suspensionTrasera = suspensionTrasera;
    }

    public Suspension getSuspensionDelantera() {
        return suspensionDelantera;
    }

    public void setSuspensionDelantera(Suspension suspensionDelantera) {
        this.suspensionDelantera = suspensionDelantera;
    }

    public Suspension getSuspensionTrasera() {
        return suspensionTrasera;
    }

    public void setSuspensionTrasera(Suspension suspensionTrasera) {
        this.suspensionTrasera = suspensionTrasera;
    }
}
