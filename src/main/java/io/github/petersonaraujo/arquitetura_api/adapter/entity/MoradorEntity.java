package io.github.petersonaraujo.arquitetura_api.adapter.entity;

import io.github.petersonaraujo.arquitetura_api.core.domain.Pessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_morador")
public class MoradorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String endereco;
    private String celular;
    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "pessoa_id")
    private PessoaEntity pessoa;
}
