package io.github.petersonaraujo.arquitetura_api.core.service;

import io.github.petersonaraujo.arquitetura_api.core.domain.Usuario;
import io.github.petersonaraujo.arquitetura_api.core.ports.input.UsuarioUseCase;

public class UsuarioService implements UsuarioUseCase {


    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuario;
    }
}
