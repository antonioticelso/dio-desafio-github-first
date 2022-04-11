package dio.resolvendoAlgoritmos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HashMagico {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qtde = Integer.parseInt(br.readLine());

        BigInteger total = BigInteger.ZERO;

        for (int i = 0; i < qtde; i++) {
            int qtdeLinhas = Integer.parseInt(br.readLine());

            for (int j = 0; j < qtdeLinhas ; j++) {
                String el = br.readLine();

                for (int k = 0; k < el.length() ; k++) {
                    for (Alfabeto alf : Alfabeto.values()) {
                        if(alf.name().equalsIgnoreCase(String.valueOf(el.charAt(k)))){
                            total = total.add(BigInteger.valueOf(alf.ordinal() + j + k));
                        }
                    }
                }
            }

            System.out.println(total);
            total = BigInteger.ZERO;
        }
    }

    public enum Alfabeto {
        A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
    }
}
