package questao2;

public class ContaCorrente {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(){

    }

    public void depositar(double deposito){
        this.saldo += deposito;
        System.out.println("Deposito de R$" + deposito + " realizado.");
    }

    public void sacar(double saque){
        double taxaOperacao = 0.05 * saque;
        this.saldo = this.saldo - (saque + taxaOperacao);
        System.out.println("Saque de R$" + saque + " realizado");
    }

    public double saldo(){
        System.out.println("Saldo de R$" + this.saldo);
        return this.saldo;
    }
}
