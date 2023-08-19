import java.util.HashMap;
import java.util.Scanner;
public class Jogo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Leitordearquivo leitor = new Leitordearquivo();
        HashMap<String, personagem> personagem = leitor.lerpersonagem("rsc/Personagens.txt");
        personagem.get("John");

        HashMap<String, capitulo> capitulos = leitor.lercapitulos("rsc/capitulo.txt", 
                                                                                          personagem, 
                                                                                          scanner);

        capitulo capitulo1J = capitulos.get("CAPITULO_1");

        capitulo capitulo2J = capitulos.get("CAPITULO_2");

        capitulo capitulo3J = capitulos.get("CAPITULO_3");

        capitulo capitulo4J = capitulos.get("CAPITULO_4");

        capitulo capitulo5J = capitulos.get("CAPITULO_5");

        capitulo capitulo6J = capitulos.get("CAPITULO_6");

        capitulo capitulo7J = capitulos.get("CAPITULO_7");

        capitulo capitulo8J = capitulos.get("CAPITULO_8");

        capitulo capitulo9J = capitulos.get("CAPITULO_9");

        Escolha[] cap1Je = new Escolha[2];
        cap1Je[0] = new Escolha("fica", capitulo3J);
        cap1Je[1] = new Escolha("foge", capitulo2J);

        Escolha[] cap2Je = new Escolha[2];
        cap2Je[0] = new Escolha("vai para cima dele", capitulo4J);
        cap2Je[1] = new Escolha("apenas ignora", capitulo5J);

        Escolha[] cap5Je = new Escolha[2];
        cap5Je[0] = new Escolha("conta", capitulo6J);
        cap5Je[1] = new Escolha("não conta", capitulo7J);

        Escolha[] cap6Je = new Escolha[2];
        cap6Je[0] = new Escolha("se alia", capitulo8J);
        cap6Je[1] = new Escolha("recusa", capitulo9J);

        Escolha[] capFinal = new Escolha[0];

        capitulo1J.Escolhas(cap1Je);
        capitulo2J.Escolhas(cap2Je);
        capitulo5J.Escolhas(cap5Je);
        capitulo6J.Escolhas(cap6Je);

        capitulo raiz = capitulo1J;
        raiz.executar();
        scanner.close();
    }
}