package br.com.designPatterns.loja;

import br.com.designPatterns.loja.pedido.GeraPedido;
import br.com.designPatterns.loja.pedido.GeraPedidoHandler;
import br.com.designPatterns.loja.pedido.acoes.EnviarEmailPedido;
import br.com.designPatterns.loja.pedido.acoes.LogPedido;
import br.com.designPatterns.loja.pedido.acoes.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidos {
    public static void main(String[] args) {
        String cliente = "Rodrigo Nunes";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = Integer.parseInt("6");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido(),
                        new LogPedido()));
        handler.executa(gerador);


    }
}
