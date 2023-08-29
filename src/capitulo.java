import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Capitulo {
  protected String texto;
  protected ArrayList<Escolha> escolhas;
  protected Personagem personagem;
  protected int variacaoEnergiaPersonagem;
  protected Scanner escaneador;

  protected Capitulo() {
    this.texto = "";
    this.escolhas = new ArrayList<Escolha>();
  }

  public Capitulo(String texto, Personagem personagem, int variacaoEnergiaPersonagem, Scanner escaneador) {
    this.texto = texto;
    this.personagem = personagem;
    this.variacaoEnergiaPersonagem = variacaoEnergiaPersonagem;
    this.escaneador = escaneador;
    this.escolhas = new ArrayList<Escolha>();

  }

  public Capitulo(Map<String, Personagem> personagens, Scanner escaneadorDoConsole, Scanner escaneadorDeArquivo) 
  {
    this.LerCapitulo(personagens, escaneadorDeArquivo);
    this.escaneador = escaneadorDoConsole;
    this.escolhas = new ArrayList<Escolha>();
  }

  protected void LerCapitulo(Map<String, Personagem> personagens, Scanner escaneadorDeArquivo) {

    escaneadorDeArquivo.nextLine();
    String idPersonagem1 = escaneadorDeArquivo.nextLine();
    this.personagem = personagens.get(idPersonagem1);

    escaneadorDeArquivo.nextLine();
    String linha = escaneadorDeArquivo.nextLine();
    this.texto = "";
    while (!linha.equals("VARIACOES")) {

      if (linha.equals(idPersonagem1)) {
        texto = texto + personagem.getNome();
      } else {
        texto = texto + linha;
      }
      linha = escaneadorDeArquivo.nextLine();

    }
    this.variacaoEnergiaPersonagem = Integer.parseInt(escaneadorDeArquivo.nextLine());

  }

  public void adicionarEscolha(Escolha escolha) {
    escolhas.add(escolha);

  }

  public void executar() {
    mostrar();

    if (escolhas.size() > 0) {
        int idCapituloEscolhido = escolher();
        System.out.println();
        System.out.println(". . .");
        System.out.println();
        escolhas.get(idCapituloEscolhido).getProximo().executar();
    } else {
        System.out.println("FIM");
    }
}

protected void mostrar() {
    System.out.println(texto);
    personagem.ajustarEnergia(variacaoEnergiaPersonagem);

    for (int i = 0; i < escolhas.size(); i++) {
        System.out.println("- " + escolhas.get(i).getTextoMostrado());
    }

    System.out.print(">> ");
}

  public int escolher() {

    int opcaoEscolhida = 0;
    String escolha;
    boolean escolhaValida = false;

    while (!escolhaValida) {

      escolha = escaneador.nextLine();
      for (int i = 0; i < escolhas.size(); i++) {
        if (escolha.equalsIgnoreCase(escolhas.get(i).getTextoDigitado())) {
          escolhaValida = true;
          opcaoEscolhida = i;
        }
      }

      if (!escolhaValida) {

        System.out.println("Escolha inválida");
      }
    }

    return opcaoEscolhida;
  }

}