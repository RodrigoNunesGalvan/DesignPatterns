package br.com.designPatterns.loja;

import br.com.designPatterns.loja.orcamento.ItemOrcamento;
import br.com.designPatterns.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposicao {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("300")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("450")));
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());
    }
}
