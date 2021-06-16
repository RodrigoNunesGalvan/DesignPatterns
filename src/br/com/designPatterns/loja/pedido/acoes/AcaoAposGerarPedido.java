package br.com.designPatterns.loja.pedido.acoes;

import br.com.designPatterns.loja.pedido.Pedido;

public interface AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido);
}
