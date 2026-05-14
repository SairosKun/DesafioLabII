import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Labirinto {
    private static final char PAREDE = 'X';
    private static final char CAMINHO = ' ';
    private static final char INICIO = 'D';
    private static final char FIM = '#';

    private int linhas;
    private int colunas;
    private char[][] labirinto;
    private boolean solucaoEncontrada = false;

    public void criaLabirinto(String filename){
        List<String> linhasList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhasList.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}