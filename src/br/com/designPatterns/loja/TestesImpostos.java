package br.com.designPatterns.loja;

import br.com.designPatterns.loja.imposto.CalculadoraDeImpostos;
import br.com.designPatterns.loja.imposto.ICMS;
import br.com.designPatterns.loja.imposto.ISS;
import br.com.designPatterns.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
        System.out.println(calculadora.calcular(orcamento, new ICMS(null)));
    }
}
