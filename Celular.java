public class Celular {
    private String marca;
    private String modelo;
    private String cor;
    private int memoria;
    private double tamanhoTela;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public String toString() {
        return "Celular [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", memoria=" + memoria
                + "GB, tamanhoTela=" + tamanhoTela + " polegadas]";
    }
}