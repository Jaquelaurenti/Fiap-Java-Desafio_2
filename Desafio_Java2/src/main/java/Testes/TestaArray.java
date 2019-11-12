package Testes;

import Contas.Conta;
import Contas.ContaCorrente;

public class TestaArray {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];

        for (int i = 0; i < contas.length; i++) {
            Conta conta = new ContaCorrente();
            conta.deposita(i * 100);
            contas[i] = conta;
        }

        double valorTotalDepositos = 0;
        for (int i = 0; i < contas.length; i++) {
            valorTotalDepositos += contas[i].getSaldo();
        }
        double media = valorTotalDepositos / contas.length;
        System.out.println("A média dos depositos realizados nas contas é de R$: " + media);
    }
}
