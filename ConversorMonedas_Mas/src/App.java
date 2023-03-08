import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.text.DecimalFormat;

public class App {

    public static final Moneda monedaConversion = new Moneda(0);
    public static final Masa masaConversion = new Masa(0);

    public static final String patron = "#.00";
    public static final DecimalFormat formato = new DecimalFormat(patron);

    public static void main(String[] args) throws Exception {

        boolean cerrar = false;
        String[] options = {"Moneda", "Masa", "Temperatura"};
        String[] options_2 = {"Si", "No", "Cancelar"};
        ImageIcon icon = new ImageIcon("src/icons/cambio-de-divisas.png");

        String[] opcionesMoneda = {"Quetzal a Dolar", "Quetzal a Euros", "Quetzal a Libras Esterlinas", "Quetzal a Yen Japones", "Quetzal a Won Sul-Coreano", "Dolar a Quetzal", "Euros a Quetzal", "Libras Esterlinas a Quetzal", "Yen Japones a Quetzal", "Won Sul-Coreano a Quetzal"};
        String[] opcionesMasa = {"Libras a Kilogramos", "Kilogramos a Libras", "Gramos a Onzas", "Onzas a Gramos"};
        String[] opcionesTemperatura = {"C° a F°", "F° a C°"};

        while(cerrar != true) {

            String menu = (String)JOptionPane.showInputDialog(null, "Escoge el conversor", "Conversor", JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);

            switch(menu) {
                case "Moneda":
                String convertir = (String)JOptionPane.showInputDialog(null, "Selecciona lo que deseas hacer:", "Conversor de monedas", JOptionPane.QUESTION_MESSAGE, icon, opcionesMoneda, opcionesMoneda[0]);
                    accionMoneda(convertir);
                break;
                case "Masa":
                String convertir_2 = (String)JOptionPane.showInputDialog(null, "Selecciona lo que deseas hacer:", "Conversor de masa", JOptionPane.QUESTION_MESSAGE, icon, opcionesMasa, opcionesMasa[0]);
                    accionMasa(convertir_2);
                break;
                case "Temperatura":
                String convertir_3 = (String)JOptionPane.showInputDialog(null, "Selecciona lo que deseas hacer:", "Conversor de temperatura", JOptionPane.QUESTION_MESSAGE, icon, opcionesTemperatura, opcionesTemperatura[0]);
                    accionTemperatura(convertir_3);
                break;
            }
            int x = JOptionPane.showOptionDialog(null, "Quiere seguir con la conversion?", "Click en la opcion",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options_2, options_2[0]);
                if(x == 1 || x == 2) {
                    cerrar = true;
                }
        }
        JOptionPane.showMessageDialog(null, "Fin del programa");
    }

    public static float ingresarValor() {
        boolean isValid = false;
        String dato = "";

        while(isValid != true) {
            dato = JOptionPane.showInputDialog("Ingrese el valor:");
            try {
                Double.parseDouble(dato);
                isValid = true;
            } catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Error, El valor no es un numero!", "Uh-oh!", JOptionPane.ERROR_MESSAGE);
                isValid = false;
            }
        }
        float f_Val = Float.valueOf(dato);

        return f_Val;
    }

    public static void accionMoneda(String accion) {
        switch(accion) {
            case "Quetzal a Dolar":
            monedaConversion.setValor(ingresarValor());
                JOptionPane.showMessageDialog(null, "Q"+formato.format(monedaConversion.gerValor())+" Quetzales es equivalente a "+"$"+formato.format(monedaConversion.quetzalDolar(false))+" Dolares", "Conversion", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Quetzal a Euros":
            monedaConversion.setValor(ingresarValor());
                JOptionPane.showMessageDialog(null, "Q"+formato.format(monedaConversion.gerValor())+" Quetzales es equivalente a "+"€"+formato.format(monedaConversion.quetzalEuros(false))+" Euros", "Conversion", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Quetzal a Libras Esterlinas":
            monedaConversion.setValor(ingresarValor());
                JOptionPane.showMessageDialog(null, "Q"+formato.format(monedaConversion.gerValor())+" Quetzales es equivalente a "+"£"+formato.format(monedaConversion.quetzalLibras(false))+" Libras Esterlinas", "Conversion", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Quetzal a Yen Japones":
            monedaConversion.setValor(ingresarValor());
                JOptionPane.showMessageDialog(null, "Q"+formato.format(monedaConversion.gerValor())+" Quetzales es equivalente a "+"¥"+formato.format(monedaConversion.quetzalYen(false))+" Yenes Japones", "Conversion", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Quetzal a Won Sul-Coreano":
            monedaConversion.setValor(ingresarValor());
                JOptionPane.showMessageDialog(null, "Q"+formato.format(monedaConversion.gerValor())+" Quetzales es equivalente a "+"₩"+formato.format(monedaConversion.quetzalWon(false))+" Won Sul-Coreano", "Conversion", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Dolar a Quetzal":
            monedaConversion.setValor(ingresarValor());
                JOptionPane.showMessageDialog(null, "$"+formato.format(monedaConversion.gerValor())+" Dolares es equivalente a "+"Q"+formato.format(monedaConversion.quetzalDolar(true))+" Quetzales", "Conversion", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Euros a Quetzal":
            monedaConversion.setValor(ingresarValor());
                JOptionPane.showMessageDialog(null, "€"+formato.format(monedaConversion.gerValor())+" Euros es equivalente a "+"Q"+formato.format(monedaConversion.quetzalEuros(true))+" Quetzales", "Conversion", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Libras Esterlinas a Quetzal":
            monedaConversion.setValor(ingresarValor());
                JOptionPane.showMessageDialog(null, "£"+formato.format(monedaConversion.gerValor())+" Libras Esterlinas es equivalente a "+"Q"+formato.format(monedaConversion.quetzalLibras(true))+" Quetzales", "Conversion", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Yen Japones a Quetzal":
            monedaConversion.setValor(ingresarValor());
                JOptionPane.showMessageDialog(null, "¥"+formato.format(monedaConversion.gerValor())+" Yenes Japones es equivalente a "+"Q"+formato.format(monedaConversion.quetzalYen(true))+" Quetzales", "Conversion", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Won Sul-Coreano a Quetzal":
            monedaConversion.setValor(ingresarValor());
                JOptionPane.showMessageDialog(null, "₩"+formato.format(monedaConversion.gerValor())+" Won Sul-Coreano es equivalente a "+"Q"+formato.format(monedaConversion.quetzalWon(true))+" Quetzales", "Conversion", JOptionPane.PLAIN_MESSAGE);
            break;
        }
    }

    public static void accionTemperatura(String accion) {
        switch(accion) {
            case "C° a F°":
            Float convierte_1 = ingresarValor();
            float operacion_1 = (convierte_1 * 9/5)+32;
            JOptionPane.showMessageDialog(null, "C° "+formato.format(convierte_1)+" es equivalente a "+"F° "+formato.format(operacion_1), "Operacion", JOptionPane.PLAIN_MESSAGE);
            break;
            case "F° a C°":
            Float convierte_2 = ingresarValor();
            float operacion_2 = (convierte_2 - 32)*5/9;
            JOptionPane.showMessageDialog(null, "F° "+formato.format(convierte_2)+" es equivalente a "+"C° "+formato.format(operacion_2), "Operacion", JOptionPane.PLAIN_MESSAGE);
            break;
        }
    }

    public static void accionMasa(String accion) {
        switch(accion) {
            case "Libras a Kilogramos":
            masaConversion.setValor(ingresarValor());
            JOptionPane.showMessageDialog(null, formato.format(masaConversion.gerValor())+" Lb es equivalente a "+formato.format(masaConversion.libraKilos(false))+" Kg", "Resultado", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Kilogramos a Libras":
            masaConversion.setValor(ingresarValor());
            JOptionPane.showMessageDialog(null, formato.format(masaConversion.gerValor())+" Kg es equivalente a "+formato.format(masaConversion.libraKilos(true))+" Lb", "Resultado", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Gramos a Onzas":
            masaConversion.setValor(ingresarValor());
            JOptionPane.showMessageDialog(null, formato.format(masaConversion.gerValor())+" Gm es equivalente a "+formato.format(masaConversion.gramoOnza(false))+" Oz", "Resultado", JOptionPane.PLAIN_MESSAGE);
            break;
            case "Onzas a Gramos":
            masaConversion.setValor(ingresarValor());
            JOptionPane.showMessageDialog(null, formato.format(masaConversion.gerValor())+" Oz es equivalente a "+formato.format(masaConversion.gramoOnza(true))+" Gm", "Resultado", JOptionPane.PLAIN_MESSAGE);
            break;
        }
    }
}