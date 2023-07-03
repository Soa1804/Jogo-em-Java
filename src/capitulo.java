import java.util.Scanner;
public class capitulo {
    String texto;
    String escolha1;
    String escolha2;
    personagem personagem;
    int pctSucesso1;
    int pctSucesso2;
    Scanner scan = new Scanner(System.in);

    public capitulo(String texto, String escolha1, String escolha2, personagem personagem, int pctSucesso1, int pctSucesso2){
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.pctSucesso1 = pctSucesso1;
        this.pctSucesso2 = pctSucesso2;
    }
    public void mostraCap(){
        System.out.println(this.texto);
        System.out.println(this.escolha1);
        System.out.println(this.escolha2);
        personagem.GanhaPct(pctSucesso1);
        personagem.PerdePct(pctSucesso2);
    }
    int escolha (String escolha1, String escolha2){
       while(true){
        String resposta = scan.nextLine();
        if(resposta.equalsIgnoreCase(escolha1)){
            return 1;
        }
        else if(resposta.equalsIgnoreCase(escolha2)){
            
            return 2;
        }
        else{
            System.out.println("você não digitou uma opção valida! digite novamente.");
        }

    }}
}
