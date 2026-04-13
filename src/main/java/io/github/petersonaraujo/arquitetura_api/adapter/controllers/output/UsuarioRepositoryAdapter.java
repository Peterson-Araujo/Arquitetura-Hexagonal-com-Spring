package io.github.petersonaraujo.arquitetura_api.adapter.controllers.output;

import io.github.petersonaraujo.arquitetura_api.adapter.entity.UsuarioEntity;
import io.github.petersonaraujo.arquitetura_api.adapter.mappers.output.UsuarioMapperEntity;
import io.github.petersonaraujo.arquitetura_api.adapter.repository.UsuarioRepository;
import io.github.petersonaraujo.arquitetura_api.core.domain.Usuario;
import io.github.petersonaraujo.arquitetura_api.core.ports.output.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapperEntity usuarioMapperEntity;

    @Override
    public Usuario create(Usuario usuario) {
        UsuarioEntity usuarioConvertido = usuarioMapperEntity.toEntity(usuario);
        return usuarioMapperEntity.toModel(usuarioRepository.save(usuarioConvertido));
    }
}
