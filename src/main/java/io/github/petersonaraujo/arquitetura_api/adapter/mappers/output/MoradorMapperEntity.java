package io.github.petersonaraujo.arquitetura_api.adapter.mappers.output;

import io.github.petersonaraujo.arquitetura_api.adapter.entity.MoradorEntity;
import io.github.petersonaraujo.arquitetura_api.core.domain.Morador;
import org.mapstruct.*;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        builder = @Builder(disableBuilder = true)
)
public interface MoradorMapperEntity {

    Morador toModel(MoradorEntity moradorEntity);

    MoradorEntity toEntity(Morador morador);
}
