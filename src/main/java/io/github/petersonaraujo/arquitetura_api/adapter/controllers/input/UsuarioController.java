package io.github.petersonaraujo.arquitetura_api.adapter.controllers.input;

import io.github.petersonaraujo.arquitetura_api.adapter.dtos.UsuarioDto;
import io.github.petersonaraujo.arquitetura_api.adapter.mappers.UsuarioMapper;
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
    private final UsuarioMapper mapper;

    @PostMapping
    public ResponseEntity<UsuarioDto> create(@RequestBody UsuarioDto usuarioDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                mapper.toResponse(
                        usuarioUseCase.createUsuario(
                                mapper.toModel(usuarioDto))
                )
        );
    }

}
