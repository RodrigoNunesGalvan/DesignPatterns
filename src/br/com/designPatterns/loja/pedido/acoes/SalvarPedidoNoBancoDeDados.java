package br.com.designPatterns.loja.pedido.acoes;

import br.com.designPatterns.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no Banco de Dados!");
    }
}
