public class Moneda extends Conversion {

    public static final double DOLAR = 0.13;
    public static final double EURO = 0.12;
    public static final double LIBRA = 0.11;
    public static final double YEN = 17.45;
    public static final double WON = 167.26;
    public static final double QUETZALD = 7.81;
    public static final double QUETZALE = 8.32;
    public static final double QUETZALL = 9.37;
    public static final double QUETZALY = 0.057;
    public static final double QUETZALW = 0.0060;

    Moneda(float valor) {
        super(valor);
    }

    public double quetzalDolar(boolean alrevez) {
        double devuelve;
        devuelve = super.gerValor();

        if(alrevez == false) {
            devuelve = devuelve * DOLAR;
        }else {
            devuelve = devuelve * QUETZALD;
        }
        return devuelve;
    }

    public double quetzalEuros(boolean alrevez) {
        double devuelve;
        devuelve = super.gerValor();

        if(alrevez == false) {
            devuelve = devuelve * EURO;
        }else {
            devuelve = devuelve * QUETZALE;
        }
        return devuelve;
    }

    public double quetzalLibras(boolean alrevez) {
        double devuelve;
        devuelve = super.gerValor();

        if(alrevez == false) {
            devuelve = devuelve * LIBRA;
        }else {
            devuelve = devuelve * QUETZALL;
        }
        return devuelve;
    }

    public double quetzalYen(boolean alrevez) {
        double devuelve;
        devuelve = super.gerValor();

        if(alrevez == false) {
            devuelve = devuelve * YEN;
        }else {
            devuelve = devuelve * QUETZALY;
        }
        return devuelve;
    }

    public double quetzalWon(boolean alrevez) {
        double devuelve;
        devuelve = super.gerValor();

        if(alrevez == false) {
            devuelve = devuelve * WON;
        }else {
            devuelve = devuelve * QUETZALW;
        }
        return devuelve;
    }
}
