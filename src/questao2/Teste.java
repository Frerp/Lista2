package questao2;

public class Teste {
    public static void main(String[] args){
        ContaCorrente contaCorrente1 = new ContaCorrente();
        ContaCorrenteEspecial ContaCorrenteEspecial1 = new ContaCorrenteEspecial();

        contaCorrente1.depositar(1500);
        contaCorrente1.sacar(400);
        contaCorrente1.saldo();

        System.out.println("");

        ContaCorrenteEspecial1.depositar(1500);
        ContaCorrenteEspecial1.sacar(400);
        ContaCorrenteEspecial1.saldo();

    }
}
