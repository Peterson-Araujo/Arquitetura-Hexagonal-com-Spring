package io.github.petersonaraujo.arquitetura_api.core.ports.output;

import io.github.petersonaraujo.arquitetura_api.core.domain.Morador;

public interface MoradorRepositoryPort {

    Morador create(Morador morador);
}
