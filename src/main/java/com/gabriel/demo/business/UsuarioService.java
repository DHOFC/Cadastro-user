package com.gabriel.demo.business;

import com.gabriel.demo.infrastructure.entity.usuario;
import com.gabriel.demo.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service


public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(usuario usuario) {
        repository.saveAndFlush(usuario);
    }

    public usuario buscarUsuario(Integer id) {
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuario não encontrado")
        );
    }

    public void deletarUsuario(Integer id){
        repository.deleteById(id);
    }

    public void atualizarUsuario(Integer id, usuario usuarioAtualizar){
        usuario usuarioEntity = buscarUsuario(id);
        usuario usuarioAtualizado = usuario.builder()
                .email(usuarioAtualizar.getEmail() != null ?
                        usuarioAtualizar.getEmail() : usuarioEntity.getEmail())
                .nome(usuarioAtualizar.getNome() != null ?
                        usuarioAtualizar.getNome() : usuarioEntity.getNome())
                .id(usuarioEntity.getId())
                .build();

        repository.saveAndFlush(usuarioAtualizado);
    }


}
