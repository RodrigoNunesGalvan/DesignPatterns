package br.com.designPatterns.loja;

public class DomainException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DomainException(String mensagem) {
        super(mensagem);
    }
}
