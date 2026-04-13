package io.github.petersonaraujo.arquitetura_api.adapter.controllers.output;

import io.github.petersonaraujo.arquitetura_api.adapter.entity.MoradorEntity;
import io.github.petersonaraujo.arquitetura_api.adapter.mappers.output.MoradorMapperEntity;
import io.github.petersonaraujo.arquitetura_api.adapter.repository.MoradorRepository;
import io.github.petersonaraujo.arquitetura_api.core.domain.Morador;
import io.github.petersonaraujo.arquitetura_api.core.ports.output.MoradorRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MoradorRepositoryAdapter implements MoradorRepositoryPort {

    private final MoradorRepository moradorRepository;
    private final MoradorMapperEntity moradorMapperEntity;

    @Override
    public Morador create(Morador morador) {
        MoradorEntity moradorConvertido = moradorMapperEntity.toEntity(morador);
        return moradorMapperEntity.toModel(moradorRepository.save(moradorConvertido));
    }
}
