package com.gabriel.demo.controller;

import com.gabriel.demo.business.UsuarioService;
import com.gabriel.demo.infrastructure.entity.usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor

public class usuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<usuario> buscarUsuario(@RequestParam Integer id){
        return ResponseEntity.ok(usuarioService.buscarUsuario(id));
    }

    @DeleteMapping
    ResponseEntity<usuario> deletarUsuario(@RequestParam Integer id){
        usuarioService.deletarUsuario(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    ResponseEntity<Void> atualizarUsuario(@RequestParam Integer id,
                                          @RequestBody usuario usuarioAtualizar){
        usuarioService.atualizarUsuario(id, usuarioAtualizar);
        return ResponseEntity.ok().build();
    }
}
