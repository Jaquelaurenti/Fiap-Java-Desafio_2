package Testes;

import Contas.Conta;
import Contas.ContaCorrente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaShort {
    public static void main(String[] args) {
        List<ContaCorrente> contas = new ArrayList<ContaCorrente>();

        ContaCorrente c1 = new ContaCorrente();
        c1.setTitular("Joao");
        c1.setNumero(1);
        c1.setAgencia("1000");
        c1.deposita(100000);

        ContaCorrente c2 = new ContaCorrente();
        c2.setTitular("Maria");
        c2.setNumero(2);
        c2.setAgencia("1000");
        c2.deposita(890000);


        ContaCorrente c3 = new ContaCorrente();
        c3.setTitular("Kardashian");
        c3.setNumero(2);
        c3.setAgencia("1000");
        c3.deposita(890000);

        contas.add(c3);
        contas.add(c2);
        contas.add(c1);

        System.out.println("Antes ordenação.");
        for (Conta conta: contas ) {
            System.out.println(conta.getTitular());
        }

        Collections.sort(contas);

        System.out.println("Após ordenação.");
        for (Conta conta: contas ) {
            System.out.println(conta.getTitular());
        }
    }
}
