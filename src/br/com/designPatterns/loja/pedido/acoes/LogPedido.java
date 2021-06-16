package br.com.designPatterns.loja.pedido.acoes;

import br.com.designPatterns.loja.pedido.Pedido;

public class LogPedido implements AcaoAposGerarPedido{

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
