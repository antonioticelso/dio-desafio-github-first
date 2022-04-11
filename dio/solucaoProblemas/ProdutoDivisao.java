package dio.solucaoProblemas;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class ProdutoDivisao {
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        BigDecimal currentNum, resultNum;
        String operator;
        String[] lineArgs;
        int N;
        N = Integer.parseInt(entrada.nextLine());
        resultNum = new BigDecimal("1.0");

        for (int i = 0; i < N; ++i) {
            lineArgs = entrada.nextLine().trim().split(" ");

            currentNum = new BigDecimal(lineArgs[0]);
            operator = lineArgs[1];

            if (operator.equals("*")) {
                resultNum = resultNum.multiply(currentNum);
            } else if (operator.equals("/")) {
                resultNum = resultNum.divide(currentNum, MathContext.DECIMAL128);
            }
        }

        System.out.println(resultNum.setScale(0, RoundingMode.DOWN));
        entrada.close();


    }

}

// "_______________________________________________________________"
//        // String pass;
//        String mult = "*";
//        String div = "/";
//        int motor = entrada.nextInt();
//        int resultado = 1;
//
//        for (int i = 0; i < motor; i++) {
//            int parce = entrada.nextInt();
//            String operador = entrada.nextLine();
//
//            if (String.valueOf(operador) == String.valueOf(mult)) {
//                System.out.println("estou aqui!");
//            } else {
//                System.out.println("nada de novo!");
//            }
//
//            // System.out.println(parce);
//        }

// entrada.close();