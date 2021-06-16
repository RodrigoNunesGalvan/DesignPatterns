package br.com.designPatterns.loja.imposto;

import br.com.designPatterns.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
       return imposto.calcular(orcamento);

        }

    }

