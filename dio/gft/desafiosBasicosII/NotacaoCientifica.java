package dio.gft.desafiosBasicosII;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class NotacaoCientifica {

    public static void main(String[] args) throws IOException {
        // DecimalFormat df = new DecimalFormat("0.0000E00");

        Scanner leitor = new Scanner(System.in);

//        float numero = leitor.nextFloat();
        double numero = leitor.nextFloat();
    //    Long numero = -10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000L;
        int cont = 0;

        String operadorI = (numero > 0) ? "+" : "-";
        String operadorII = "+";
        String mantissa;
        String expoente;

        if (numero == 0) {
            numero = numero * (-1);
            operadorII = (numero >= 0) ? "+" : "-";

            System.out.println(operadorI + "0.0000E" + operadorII + "00");
        }

        if (numero != 0) {
            numero = (numero >= 0) ? (numero * 1) : (numero * -1);

            while (numero < 1) {
                operadorII = "-";
                cont++;
                numero = numero * 10;
            }

            while (numero >= 10) {
                operadorII = "+";
                cont++;
                numero = numero / 10;
            }

            expoente = (cont < 10) ? ("0" + cont) : String.valueOf(cont);

            mantissa = String.format("%.4f", numero);

            System.out.println(operadorI + mantissa + "E" + operadorII + expoente);

        }

        leitor.close();

    }

}
