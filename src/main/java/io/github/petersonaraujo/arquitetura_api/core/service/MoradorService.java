package io.github.petersonaraujo.arquitetura_api.core.service;

import io.github.petersonaraujo.arquitetura_api.core.domain.Morador;
import io.github.petersonaraujo.arquitetura_api.core.ports.input.MoradorUseCase;
import io.github.petersonaraujo.arquitetura_api.core.ports.output.MoradorRepositoryPort;

public class MoradorService implements MoradorUseCase {

    private final MoradorRepositoryPort moradorRepositoryPort;

    public MoradorService(MoradorRepositoryPort moradorRepositoryPort) {
        this.moradorRepositoryPort = moradorRepositoryPort;
    }

    @Override
    public Morador createMorador(Morador morador) {
        return moradorRepositoryPort.create(morador);
    }
}
