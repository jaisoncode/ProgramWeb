CREATE TABLE cliente(
    id bigint not null auto_increment,
    nome varchar(150),
    pontuacao int, 
    avaliacao numeric(3,2),
    PRIMARY KEY(id)
);