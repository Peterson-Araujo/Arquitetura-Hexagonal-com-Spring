package io.github.petersonaraujo.arquitetura_api.adapter.dtos;

import io.github.petersonaraujo.arquitetura_api.core.domain.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoradorDto {

    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String celular;

}
