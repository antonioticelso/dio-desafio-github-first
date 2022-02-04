package dio.gft.desafiosBasicos;

import java.util.Scanner;

public class Filme {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
        //Escreva aqui a sua lógica
        double aumentoIngresso = ((B - A) * 100) / A;

        System.out.println(aumentoIngresso);
        System.out.println("%");

    }
}
