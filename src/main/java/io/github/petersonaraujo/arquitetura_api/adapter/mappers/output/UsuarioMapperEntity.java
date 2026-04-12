package io.github.petersonaraujo.arquitetura_api.adapter.mappers.output;

import io.github.petersonaraujo.arquitetura_api.adapter.entity.UsuarioEntity;
import io.github.petersonaraujo.arquitetura_api.core.domain.Usuario;
import org.mapstruct.*;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        builder = @Builder(disableBuilder = true)
)
public interface UsuarioMapperEntity {

    Usuario toModel(UsuarioEntity usuarioEntity);

    UsuarioEntity toEntity(Usuario usuario);

}
