package io.github.petersonaraujo.arquitetura_api.adapter.mappers;

import io.github.petersonaraujo.arquitetura_api.adapter.dtos.UsuarioDto;
import io.github.petersonaraujo.arquitetura_api.adapter.entity.UsuarioEntity;
import io.github.petersonaraujo.arquitetura_api.core.domain.Usuario;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        builder = @Builder(disableBuilder = true)
)
public interface UsuarioMapper {

    // Converter DTO recebido para Model
    Usuario toModel(UsuarioDto usuarioDto);

    // Converter Model para DTO pro retorno da chamada
    UsuarioDto toResponse(Usuario usuario);

    Usuario toModel(UsuarioEntity usuarioEntity);

    UsuarioEntity toEntity(Usuario usuario);
}
