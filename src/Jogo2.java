import java.util.Map;
import java.util.Scanner;

public class Jogo2 {

    public static void main(String[] args) {
        LeitorDeArquivos leitor = new LeitorDeArquivos();
        Scanner escaneador = new Scanner(System.in, "UTF-8");

        Map<String, Personagem> personagens = leitor.carregarPersonagens("rsc/Personagens.txt");
        Map<String, Capitulo> capitulos = leitor.carregarCapitulos("rsc/Capitulos.txt", personagens, escaneador);

        System.out.println("Carregamento finalizado\n\n...\n\n");

        Capitulo raiz = capitulos.get("Capitulo001");
        raiz.executar();

        escaneador.close();

    }

}
