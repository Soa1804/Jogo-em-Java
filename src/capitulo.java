import java.util.Scanner;
class capitulo {
    private String texto;
    private personagem personagem;
    private int pctSucesso1;
    private int pctSucesso2;
    private Escolha[] escolhas;
    private Scanner scan = new Scanner(System.in);

    public capitulo(String texto, personagem personagem, int pctSucesso1, int pctSucesso2) {
        this.texto = texto;
        this.personagem = personagem;
        this.pctSucesso1 = pctSucesso1;
        this.pctSucesso2 = pctSucesso2;
    }

    public void setEscolhas(Escolha[] escolhas) {
        this.escolhas = escolhas;
    }

    public void mostrar() {
        System.out.println(this.texto);
        personagem.ganhaPct(pctSucesso1);
        personagem.perdePct(pctSucesso2);
        if (escolhas != null) {
            System.out.println("As escolhas são: ");
            for (Escolha escolha : escolhas) {
                System.out.println(escolha.getTexto());
            }
        }
    }

    public void escolher() {
        boolean escolhaInvalida = true;
        while (escolhaInvalida) {
            String resposta = scan.nextLine();
            for (Escolha escolha : escolhas) {
                if (resposta.equalsIgnoreCase(escolha.getTexto())) {
                    escolhaInvalida = false;
                    capitulo proximoCapitulo = escolha.getProximo();
                    proximoCapitulo.executar();
                    return;
                }
            }
            System.out.println("Você não digitou uma opção inválida! Digite novamente.");
        }
    }

    public void executar() {
        mostrar();
        escolher();
    }
}
