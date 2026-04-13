package io.github.petersonaraujo.arquitetura_api.adapter.controllers.input;

import io.github.petersonaraujo.arquitetura_api.adapter.dtos.MoradorDto;
import io.github.petersonaraujo.arquitetura_api.adapter.mappers.input.MoradorMapperDto;
import io.github.petersonaraujo.arquitetura_api.core.domain.Morador;
import io.github.petersonaraujo.arquitetura_api.core.domain.Pessoa;
import io.github.petersonaraujo.arquitetura_api.core.ports.input.MoradorUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/moradores")
@RequiredArgsConstructor
public class MoradorController {

    private final MoradorUseCase moradorUseCase;
    private final MoradorMapperDto moradorMapperDto;

    @PostMapping
    public ResponseEntity<MoradorDto> create(@RequestBody MoradorDto moradorDto) {

        Morador moradorConvertido = moradorMapperDto.toModel(moradorDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(moradorMapperDto.toResponse(moradorUseCase.createMorador(moradorConvertido)));
    }
}
