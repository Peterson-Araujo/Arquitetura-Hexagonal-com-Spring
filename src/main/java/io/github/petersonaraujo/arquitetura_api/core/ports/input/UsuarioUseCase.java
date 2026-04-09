package io.github.petersonaraujo.arquitetura_api.core.ports.input;

import io.github.petersonaraujo.arquitetura_api.core.domain.Usuario;

public interface UsuarioUseCase {

    Usuario createUsuario(Usuario usuario);

}
