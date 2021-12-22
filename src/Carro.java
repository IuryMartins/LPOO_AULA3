public class Carro {
    String cor;
    String tipo;
    String placas;
    int numPortas;
    Pessoa dono;

    public Carro() {
    }

    public Carro(String cor, String tipo, String placas, int numPortas, Pessoa dono) {
        this.cor = cor;
        this.tipo = tipo;
        this.placas = placas;
        this.numPortas = numPortas;
        this.dono = dono;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", placas='" + placas + '\'' +
                ", numPortas=" + numPortas +
                ", dono=" + dono +
                '}';
    }
}
