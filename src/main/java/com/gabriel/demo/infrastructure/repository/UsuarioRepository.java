package com.gabriel.demo.infrastructure.repository;

import com.gabriel.demo.infrastructure.entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<usuario, Integer> {
}
