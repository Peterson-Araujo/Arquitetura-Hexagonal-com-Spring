package io.github.petersonaraujo.arquitetura_api.core.ports.output;

import io.github.petersonaraujo.arquitetura_api.core.domain.Usuario;

public interface UsuarioRepositoryPort {

    Usuario create(Usuario usuario);

}
