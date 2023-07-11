import java.util.Scanner;
public class capitulo {
    String texto;
    String escolha1;
    String escolha2;
    personagem personagem;
    int pctSucesso1;
    int pctSucesso2;
    String[] escolhas;
    Scanner scan = new Scanner(System.in);

    public capitulo(String texto, String[] escolhas, personagem personagem, int pctSucesso1, int pctSucesso2){
        this.texto = texto;
        this.personagem = personagem;
        this.pctSucesso1 = pctSucesso1;
        this.pctSucesso2 = pctSucesso2;
        this.escolhas = escolhas;
    }
    public void mostraCap(){
        System.out.println(this.texto);
        personagem.GanhaPct(pctSucesso1);
        personagem.PerdePct(pctSucesso2);
        if(escolhas != null){
            System.out.println("as esolhas são: ");
            for(String escolha: escolhas){
                System.out.println(escolha);
            }
        }
    }
    
    int escolha(String[] escolhas) {
        int resultado = -1;
        boolean escolhaInvalida = true;
        while (escolhaInvalida) {
            String resposta = scan.nextLine();
            for (int i = 0; i < this.escolhas.length; i++) {
                if (resposta.equalsIgnoreCase(this.escolhas[i])) {
                    resultado = i;
                    escolhaInvalida = false;
                } else {
                    System.out.println("você não digitou uma opção valida! digite novamente.");
                }
            }
        }
        return resultado;
    }
}