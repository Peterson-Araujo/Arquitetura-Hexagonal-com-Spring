package io.github.petersonaraujo.arquitetura_api.core.ports.input;

import io.github.petersonaraujo.arquitetura_api.core.domain.Morador;

public interface MoradorUseCase {

    Morador createMorador(Morador morador);
}
