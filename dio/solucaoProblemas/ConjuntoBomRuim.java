package dio.solucaoProblemas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConjuntoBomRuim {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N != 0) {
            List<String> conjunto = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                conjunto.add(br.readLine());
            }

            conjunto = conjunto.stream().sorted().collect(Collectors.toList());
            String saida = "Conjunto Bom";

            for (int i = 0; i < N - 1; i++) {
                if (conjunto.get(i + 1).startsWith(conjunto.get(i))) {
                    saida = "Conjunto Ruim";
                }
            }

            System.out.println(saida);
            N = Integer.valueOf(br.readLine());
        }

        // "_______________________________________________________________"
//        int qtd = Integer.parseInt(br.readLine());
//        String bomRuim = "";
//        List<String> palavras = new ArrayList<>();
//
//        while (qtd != 0) {
//            for (int k = 0; k < qtd; k++) {
//                palavras.add(br.readLine());
//            }
//
//            palavras = palavras.stream().sorted().collect(Collectors.toList());
//            bomRuim = "Conjunto Bom";
//
//            for (int i = 0; i < qtd - 1; i++) {
//                if (palavras.get(i + 1).startsWith(palavras.get(i))) {
//                    bomRuim = "Conjunto Ruim";
//                }
//            }
//
//            System.out.println(bomRuim);
//            bomRuim = "";
//            palavras.clear();
//            qtd = Integer.valueOf(br.readLine());
//
//        }

    }

}