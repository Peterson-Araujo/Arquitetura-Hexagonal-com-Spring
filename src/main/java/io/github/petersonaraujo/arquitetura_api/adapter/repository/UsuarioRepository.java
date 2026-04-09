package io.github.petersonaraujo.arquitetura_api.adapter.repository;

import io.github.petersonaraujo.arquitetura_api.adapter.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
