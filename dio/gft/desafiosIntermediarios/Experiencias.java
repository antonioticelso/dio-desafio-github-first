package dio.gft.desafiosIntermediarios;

import java.util.Scanner;

public class Experiencias {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double coelho = 0, rato = 0, sapo = 0, soma = 0;
        double coelhoM = 0, ratoM = 0, sapoM = 0;
        
        int a = input.nextInt();
        String recebi;
    
        for (int i = 0; i <= a; i++) {
            char t = 'n';
            recebi = input.nextLine();
            if (i == 0) {
                continue;
            }

            if (recebi.length() == 4) {
                t = recebi.charAt(recebi.length() - 1);
                if (t == 'C') {
                    coelho += Integer.parseInt(recebi.substring(0, 2));
                }
                if (t == 'R') {
                    rato += Integer.parseInt(recebi.substring(0, 2));
                }
                if (t == 'S') {
                    sapo += Integer.parseInt(recebi.substring(0, 2));
                }

            }

            if (recebi.length() == 3) {
                t = recebi.charAt(recebi.length() - 1);
                if (t == 'C') {
                    coelho += Integer.parseInt(recebi.substring(0, 1));
                }
                if (t == 'R') {
                    rato += Integer.parseInt(recebi.substring(0, 1));
                }
                if (t == 'S') {
                    sapo += Integer.parseInt(recebi.substring(0, 1));
                }

            }
        }

        soma = coelho + rato + sapo;

        System.out.println("Total: " + String.format("%.0f", soma) + " cobaias");
        System.out.println("Total de coelhos: " + String.format("%.0f", coelho));
        System.out.println("Total de ratos: " + String.format("%.0f", rato));
        System.out.println("Total de sapos: " + String.format("%.0f", sapo));

        coelhoM = ((coelho * 100) / soma);
        ratoM = ((rato * 100) / soma);
        sapoM = ((sapo * 100) / soma);

        System.out.println("Percentual de coelhos: " + String.format("%.2f", coelhoM) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", ratoM) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", sapoM) + " %");

    }

}
