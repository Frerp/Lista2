package questao3;

public class Dvd extends Produto {
    private int duracao;

    public Dvd(String nome, double preco, int duracao){
        super(nome, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "\nnome = " + super.getNome() + "\npreco = " + super.getPreco() + "\nduracao = " + this.duracao;
    }
}
