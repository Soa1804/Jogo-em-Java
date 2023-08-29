import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CapituloDeImagem extends Capitulo {
    private String imagem;

    public CapituloDeImagem(
            Map<String, Personagem> personagens,
            Scanner escaneadorDoConsole,
            Scanner escaneadorDeArquivo) {
        super();
        this.lerCapitulo(personagens, escaneadorDeArquivo);
        this.escaneador = escaneadorDoConsole;
        this.escolhas = new ArrayList<Escolha>();
    }

    protected void lerCapitulo(Map<String, Personagem> personagens, Scanner escaneadorDeArquivo) {
        super.LerCapitulo(personagens, escaneadorDeArquivo);

        escaneadorDeArquivo.nextLine();
        String linha = escaneadorDeArquivo.nextLine();
        this.imagem = "";
        if (linha.equals("IMAGEM")) {
            while (!linha.equals("IMAGEM_FIM")) {
                this.imagem = imagem + "\n" + linha;
                linha = escaneadorDeArquivo.nextLine();
            }
        }
    }

    protected void mostrar() {

        System.out.println();
        System.out.println("---");
        System.out.println(this.imagem);
        super.mostrar();

    }
}
