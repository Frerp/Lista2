package questao3;

public class Livros extends Produto{
    private String autor;

    public Livros(String nome, double preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\nnome = " + super.getNome() + "\npreco = " + super.getPreco() + "\nautor = " + this.autor;
    }

    



}
