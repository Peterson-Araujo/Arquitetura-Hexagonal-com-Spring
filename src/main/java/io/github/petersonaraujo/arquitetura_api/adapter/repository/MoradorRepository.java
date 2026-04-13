package io.github.petersonaraujo.arquitetura_api.adapter.repository;

import io.github.petersonaraujo.arquitetura_api.adapter.entity.MoradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository<MoradorEntity, Long> {
}
