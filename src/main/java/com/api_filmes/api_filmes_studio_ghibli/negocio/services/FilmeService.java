package com.api_filmes.api_filmes_studio_ghibli.negocio.services;

import com.api_filmes.api_filmes_studio_ghibli.controlador.dtos.FilmeRequestDTO;
import com.api_filmes.api_filmes_studio_ghibli.infraestrutura.entity.FilmeEntity;
import com.api_filmes.api_filmes_studio_ghibli.infraestrutura.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmeService {

    private final FilmeRepository repository;

    public void adicionarFilme(FilmeRequestDTO dto) {

        FilmeEntity filme = new FilmeEntity(
                null,
                dto.nome(),
                dto.sobre(),
                dto.sinopse(),
                dto.anoLancamento(),
                dto.duracao(),
                dto.genero()
        );

        repository.save(filme);
    }

    public List<FilmeEntity> listarFilmes() {
        return repository.findAll();
    }

    public void removerFilme(long id) {
        repository.deleteById(id);
    }

    public void atualizarFilme(long id, FilmeRequestDTO dto) {

        FilmeEntity filme = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Filme não encontrado"));

        filme.setNome(dto.nome());
        filme.setSobre(dto.sobre());
        filme.setSinopse(dto.sinopse());
        filme.setAnoLancamento(dto.anoLancamento());
        filme.setDuracao(dto.duracao());
        filme.setGenero(dto.genero());

        repository.save(filme);
    }
}