package com.api_filmes.api_filmes_studio_ghibli.infraestrutura;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "filmes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilmeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String sobre;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String sinopse;

    @Column(nullable = false)
    private Integer anoLancamento;

    @Column(nullable = false)
    private Integer duracao;

    @Column(nullable = false)
    private String genero;
}