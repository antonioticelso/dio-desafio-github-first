package dio.gft.desafiosBasicosII;

import java.util.Scanner;

public class NotacaoCientificaString {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String numero = leitor.nextLine();

        String operadorI = "+";
        String mantissa = "0.0000";
        String constante = "E";
        String operadorII = "+";
        String expoente = "00";
            
        int cont = 0;
        double passagem = 0;
        
        if (String.valueOf(numero.charAt(0)).equals("-")) {
            operadorI = "-";
            String substituta = "";
            for (int i = 1; i < numero.length(); i++) {
              substituta = substituta + numero.charAt(i);
            }
            numero = substituta;
          }
          
          for (int i = 0; i < numero.length(); i++) {
            if (!String.valueOf(numero.charAt(i)).equals("0")) {
              if (!String.valueOf(numero.charAt(i)).equals(".")) {
                mantissa = numero.substring(i, numero.length());
                break;
              }
              
            }
          }
          
          if (mantissa.length() < 6) {
            String substituta = mantissa;
            mantissa = "";
            for (int i = substituta.length(); i < 5; i++) {
              substituta = substituta + "0";
            }
            
            for (int k = 0; k < substituta.length(); k++) {
              if (k == 1) {
                mantissa = mantissa + ".";
              }
              mantissa = mantissa + substituta.charAt(k);
            }
          }
      
          
          passagem = Double.parseDouble(numero);
      
          if (passagem < 1 && passagem > 0) {
            operadorII = "-";
            
            while (passagem < 1) {
              cont++;
              passagem = passagem * 10;
            }
          }
          
          while(passagem >= 10) {
            cont++;
            passagem = passagem / 10;
          }
          
          
          if (cont < 10) {
            expoente = "0" + cont;
          } else {
            expoente = String.valueOf(cont);
          }
      
      
          
          
          System.out.println(operadorI + mantissa + constante + operadorII + expoente);
          
          
          leitor.close();
          
    }

}
