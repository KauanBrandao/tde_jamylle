import java.util.ArrayList;
import java.util.List;

public class Conta  {
    private double saldo;
    private List<String> transacoes;

        public Conta() {
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }



    public void informarGasto(double valor) {
        saldo += valor;
        transacoes.add("Déposito: + R$" + String.format("%.2f", valor));
    }


    public void informarDeposito(double valor) {
            if(saldo > valor) {
                System.out.println("Saldo insuficiente!");
            } else {
                saldo -= valor;
                transacoes.add("Saque: - R$" + String.format("%.2f", valor));
            }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<String> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<String> transacoes) {
        this.transacoes = transacoes;
    }

    public List<String> ultimasTransacoes(int quantidade) {
        int start = Math.max(0, transacoes.size() - quantidade);
        return transacoes.subList(start, transacoes.size());
    }

}
