package edu.pw2.superloja.model.cliente;

public record ClienteData(Long id, String nome, Integer pontuacao, Double avaliacao) {
    public ClienteData(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getPontuacao(), cliente.getAvaliacao());
    }
}
