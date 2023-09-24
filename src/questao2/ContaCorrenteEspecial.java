package questao2;

public class ContaCorrenteEspecial extends ContaCorrente{
    
    public ContaCorrenteEspecial(){
        super();
    }

    @Override
    public void sacar(double saque){
        double taxaOperacao = 0.01 * saque;
        double novoSaldo = this.getSaldo() - (saque + taxaOperacao);
        this.setSaldo(novoSaldo);
        System.out.println("Saque de R$" + saque + " realizado");
    }
}
