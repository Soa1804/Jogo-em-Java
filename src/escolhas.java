class Escolha {
    private String texto;
    private capitulo proximo;

    public Escolha(String texto, capitulo proximo) {
        this.texto = texto;
        this.proximo = proximo;
    }

    public String getTexto() {
        return texto;
    }

    public capitulo getProximo() {
        return proximo;
    }
}