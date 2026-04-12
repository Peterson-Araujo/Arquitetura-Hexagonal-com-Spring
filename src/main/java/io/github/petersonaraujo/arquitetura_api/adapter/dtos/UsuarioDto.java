package io.github.petersonaraujo.arquitetura_api.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {

    private Long id;
    private String email;
    private String senha;
    private Boolean administrador;
    private String pessoa;

}
