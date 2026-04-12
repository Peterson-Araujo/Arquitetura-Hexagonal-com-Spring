package io.github.petersonaraujo.arquitetura_api.adapter.controllers.input;

import io.github.petersonaraujo.arquitetura_api.adapter.controllers.converters.UsuarioConverter;
import io.github.petersonaraujo.arquitetura_api.adapter.dtos.UsuarioDto;
import io.github.petersonaraujo.arquitetura_api.adapter.mappers.input.UsuarioMapperDto;
import io.github.petersonaraujo.arquitetura_api.core.domain.Usuario;
import io.github.petersonaraujo.arquitetura_api.core.ports.input.UsuarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioUseCase usuarioUseCase;
    private final UsuarioMapperDto usuarioMapperDto;

    @PostMapping
    public ResponseEntity<UsuarioDto> create(@RequestBody UsuarioDto usuarioDto) {
        Usuario usuarioConvertido = usuarioMapperDto.toModel(usuarioDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(usuarioMapperDto.toResponse(usuarioUseCase.createUsuario(usuarioConvertido)));
    }

}
