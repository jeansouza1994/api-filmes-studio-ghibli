package com.api_filmes.api_filmes_studio_ghibli.infraestrutura.repository;

import com.api_filmes.api_filmes_studio_ghibli.infraestrutura.entity.FilmeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<FilmeEntity, Long> {
}