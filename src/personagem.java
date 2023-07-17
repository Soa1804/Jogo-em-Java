public class personagem {
    private String nome;
    private int pctSucesso;

    public personagem(String nome) {
        this.nome = nome;
        this.pctSucesso = 0;
    }

    public String getNome() {
        return nome;
    }

    public void ganhaPct(int pct) {
        pctSucesso += pct;
        if (pct != 0) {
            if (pctSucesso < 100) {
                System.out.println(nome + " ganhou " + pct + "% de chance de sucesso!\n" +
                        "Sua chance de fuga agora é de " + pctSucesso + "%");
            } else {
                System.out.println(nome + " ganhou " + pct + "% de chance de sucesso!\n" +
                        "Sua chance de fuga agora é de " + pctSucesso + "%\n" +
                        "Conseguiu fugir!");
            }
        }
    }

    public void perdePct(int pct) {
        pctSucesso -= pct;
        if (pct != 0) {
            System.out.println(nome + " perdeu " + pct + "% de chance de sucesso!\n" +
                    "Sua chance de fuga agora é de " + pctSucesso + "%");
        }
    }
}
