package questao3;

public class Cd extends Produto{
    private int numeroDeFaixas;

    public Cd(String nome, double preco, int numeroDeFaixas){
        super(nome, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public String toString() {
        return "\nnome = " + super.getNome() + "\npreco = " + super.getPreco() + "\nnumero de faixas = " + this.numeroDeFaixas;
    }
}
