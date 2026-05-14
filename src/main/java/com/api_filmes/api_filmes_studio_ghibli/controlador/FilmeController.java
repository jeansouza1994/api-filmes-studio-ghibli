package com.api_filmes.api_filmes_studio_ghibli.controlador;

import com.api_filmes.api_filmes_studio_ghibli.controlador.dtos.FilmeRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/filme")
public class FilmeController {

    @PostMapping
    public ResponseEntity<Void> adicionarFilme(@RequestBody FilmeRequestDTO filme) {
        return null;
    }

    @GetMapping
    public ResponseEntity<FilmeRequestDTO> listarFilme() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<Void> removerFilme(@RequestParam long id) {
        return null;
    }

    @PutMapping
    public ResponseEntity<Void> atualizarFilme(@RequestBody FilmeRequestDTO filme) {
        return null;
    }
}
