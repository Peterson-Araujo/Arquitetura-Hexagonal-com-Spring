package io.github.petersonaraujo.arquitetura_api.infra;

import io.github.petersonaraujo.arquitetura_api.core.ports.input.MoradorUseCase;
import io.github.petersonaraujo.arquitetura_api.core.ports.input.UsuarioUseCase;
import io.github.petersonaraujo.arquitetura_api.core.ports.output.MoradorRepositoryPort;
import io.github.petersonaraujo.arquitetura_api.core.ports.output.UsuarioRepositoryPort;
import io.github.petersonaraujo.arquitetura_api.core.service.MoradorService;
import io.github.petersonaraujo.arquitetura_api.core.service.UsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name = "usuarioBean")
    public UsuarioUseCase usuarioUseCaseImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }

    @Bean(name = "moradorBean")
    public MoradorUseCase moradorUseCaseImpl(MoradorRepositoryPort moradorRepositoryPort) {
        return new MoradorService(moradorRepositoryPort);
    }
}
