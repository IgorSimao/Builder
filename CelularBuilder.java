public class CelularBuilder {
    private String marca;
    private String modelo;
    private String cor;
    private int memoria;
    private double tamanhoTela;

    public CelularBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public CelularBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CelularBuilder cor(String cor) {
        this.cor = cor;
        return this;
    }

    public CelularBuilder memoria(int memoria) {
        this.memoria = memoria;
        return this;
    }

    public CelularBuilder tamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
        return this;
    }

    public Celular build() {
        Celular celular = new Celular();
        celular.setMarca(marca);
        celular.setModelo(modelo);
        celular.setCor(cor);
        celular.setMemoria(memoria);
        celular.setTamanhoTela(tamanhoTela);
        return celular;
    }
}
