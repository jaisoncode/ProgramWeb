package edu.pw2.superloja.model.cliente;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer pontuacao;
    private Double avaliacao;
    public Cliente(ClienteData dados) {
        this.nome = dados.nome();
        this.pontuacao = dados.pontuacao();
        this.avaliacao = dados.avaliacao();
    }
    public void update(ClienteDataResumo dados) {
        this.nome = dados.nome();
        this.pontuacao = dados.pontuacao();
        this.avaliacao = dados.avaliacao();
    }
}
