package edu.pw2.superloja.model.endereco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Endereco {
    private Long id;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    public Endereco(CepData data) {
        this.cep = data.cep();
        this.logradouro = data.logradouro();
        this.numero = data.numero();
        this.complemento = data.complemento();
        this.bairro = data.bairro();
        this.localidade = data.localidade();
        this.uf = data.uf();
    } 
}
