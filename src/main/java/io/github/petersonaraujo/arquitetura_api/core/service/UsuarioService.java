package io.github.petersonaraujo.arquitetura_api.core.service;

import io.github.petersonaraujo.arquitetura_api.core.domain.Usuario;
import io.github.petersonaraujo.arquitetura_api.core.ports.input.UsuarioUseCase;
import io.github.petersonaraujo.arquitetura_api.core.ports.output.UsuarioRepositoryPort;

public class UsuarioService implements UsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepositoryPort.create(usuario);
    }
}
