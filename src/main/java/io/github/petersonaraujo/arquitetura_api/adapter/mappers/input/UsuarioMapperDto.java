package io.github.petersonaraujo.arquitetura_api.adapter.mappers.input;

import io.github.petersonaraujo.arquitetura_api.adapter.dtos.UsuarioDto;
import io.github.petersonaraujo.arquitetura_api.adapter.entity.UsuarioEntity;
import io.github.petersonaraujo.arquitetura_api.core.domain.Pessoa;
import io.github.petersonaraujo.arquitetura_api.core.domain.Usuario;
import org.mapstruct.*;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        builder = @Builder(disableBuilder = true)
)
public interface UsuarioMapperDto {

    @Mapping(target = "pessoa", source = "pessoa")
    Usuario toModel(UsuarioDto usuarioDto);

    UsuarioDto toResponse(Usuario usuario);

    // String -> Pessoa
    default Pessoa map(String nome) {
        return nome == null ? null : new Pessoa(null, nome);
    }

    // Pessoa -> String
    default String map(Pessoa pessoa) {
        return pessoa != null ? pessoa.getNome() : null;
    }
}