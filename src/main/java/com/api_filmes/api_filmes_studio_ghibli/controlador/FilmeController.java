package com.api_filmes.api_filmes_studio_ghibli.controlador;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/filme")
public class FilmeController {

    @PostMapping
    public ResponseEntity<Void> adicionarFilme() {
        return null;
    }
}
