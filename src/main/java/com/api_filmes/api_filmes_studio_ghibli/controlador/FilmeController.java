package com.api_filmes.api_filmes_studio_ghibli.controlador;

import com.api_filmes.api_filmes_studio_ghibli.negocio.services.FilmeService;
import com.api_filmes.api_filmes_studio_ghibli.controlador.dtos.FilmeRequestDTO;
import com.api_filmes.api_filmes_studio_ghibli.infraestrutura.entity.FilmeEntity;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/filme")
public class FilmeController {

    private final FilmeService service;

    @PostMapping
    public ResponseEntity<Void> adicionarFilme(
            @RequestBody @Valid FilmeRequestDTO filme) {

        service.adicionarFilme(filme);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<FilmeEntity>> listarFilme() {

        return ResponseEntity.ok(service.listarFilmes());
    }

    @DeleteMapping
    public ResponseEntity<Void> removerFilme(@RequestParam long id) {

        service.removerFilme(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarFilme(
            @RequestParam long id,
            @RequestBody @Valid FilmeRequestDTO filme) {

        service.atualizarFilme(id, filme);

        return ResponseEntity.noContent().build();
    }
}