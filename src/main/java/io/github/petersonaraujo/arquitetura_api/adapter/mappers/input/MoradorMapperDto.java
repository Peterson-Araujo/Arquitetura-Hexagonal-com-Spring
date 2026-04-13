package io.github.petersonaraujo.arquitetura_api.adapter.mappers.input;

import io.github.petersonaraujo.arquitetura_api.adapter.dtos.MoradorDto;
import io.github.petersonaraujo.arquitetura_api.core.domain.Morador;
import io.github.petersonaraujo.arquitetura_api.core.domain.Pessoa;
import org.mapstruct.*;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        builder = @Builder(disableBuilder = true)
)
public interface MoradorMapperDto {

    @Mapping(target = "pessoa", source = "nome")
    Morador toModel(MoradorDto moradorDto);

    @Mapping(target = "nome", source = "pessoa")
    MoradorDto toResponse(Morador morador);

    // String -> Pessoa
    default Pessoa map(String nome) {
        return nome == null ? null : new Pessoa(null, nome);
    }

    // Pessoa -> String
    default String map(Pessoa pessoa) {
        return pessoa != null ? pessoa.getNome() : null;
    }
}
