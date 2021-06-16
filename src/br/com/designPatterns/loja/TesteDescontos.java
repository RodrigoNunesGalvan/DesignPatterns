package br.com.designPatterns.loja;

import br.com.designPatterns.loja.descontos.CalculadoraDeDescontos;
import br.com.designPatterns.loja.imposto.CalculadoraDeImpostos;
import br.com.designPatterns.loja.imposto.ICMS;
import br.com.designPatterns.loja.imposto.ISS;
import br.com.designPatterns.loja.orcamento.ItemOrcamento;
import br.com.designPatterns.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("300")));

        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("10000")));

        Orcamento terceiro = new Orcamento();
        terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("2000")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));

    }
}
