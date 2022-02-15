package dio.gft.tratamentoExcecoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ChekedException {

    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = "romances-blake.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);
        
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();

        } while(line != null);

        bw.flush();
        br.close();
        
    }

}
