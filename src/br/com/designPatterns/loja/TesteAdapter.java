package br.com.designPatterns.loja;

import br.com.designPatterns.loja.http.JavaHttpClient;
import br.com.designPatterns.loja.orcamento.Orcamento;
import br.com.designPatterns.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
