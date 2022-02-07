package dio.gft.desafiosBasicosII;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class NotacaoCientifica {

    public static void main(String[] args) throws IOException {
        // DecimalFormat df = new DecimalFormat("0.0000E00");

        Scanner leitor = new Scanner(System.in);

        double numero = leitor.nextDouble();
        String operadorI = (numero > 0) ? "+" : "-";
        String operadorII = (numero > 1) ? "+" : "-";
        String mantissa = String.format("%.4f", numero);
        String expoente;


         System.out.println(operadorI + mantissa + "E" + operadorII + expoente);


//        if (numero > 0)
//            System.out.printf("+%.4fE+%d", numero, expoente);
//        else
//            System.out.printf("-%.4fE-%d", numero, expoente);


//        System.out.printf("%.4f", numero);
//        System.out.printf("E+%d", expoente);

        leitor.close();

    }


}
