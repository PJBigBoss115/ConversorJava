public class Masa extends Conversion {

    Masa(float valor) {
        super(valor);
    }

    public double libraKilos(boolean alrevez) {
        double devuelve;
        devuelve = super.gerValor();

        if(alrevez == false) {
            devuelve = devuelve/2.205;
        }else {
            devuelve = devuelve*2.205;
        }
        return devuelve;
    }

    public double gramoOnza(boolean alrevez) {
        double devuelve;
        devuelve = super.gerValor();

        if(alrevez == false) {
            devuelve = devuelve/28.35;
        }else {
            devuelve = devuelve*28.35;
        }
        return devuelve;
    }
    
}
