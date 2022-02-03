package dio.solucaoProblemas;

import java.io.IOException;
import java.util.Scanner;

public class ProdutoDivisao {
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        // String pass;
        String mult = "*";
        String div = "/";
        int motor = entrada.nextInt();
        int resultado = 1;

        for (int i = 0; i < motor; i++) {
            int parce = entrada.nextInt();
            String operador = entrada.nextLine();

            if (String.valueOf(operador) == String.valueOf(mult)) {
                System.out.println("estou aqui!");
            } else {
                System.out.println("nada de novo!");
            }

            // System.out.println(parce);
        }

        entrada.close();
    }

}
