package io.github.petersonaraujo.arquitetura_api.infra;

import io.github.petersonaraujo.arquitetura_api.core.ports.input.UsuarioUseCase;
import io.github.petersonaraujo.arquitetura_api.core.service.UsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name = "usuarioBean")
    public UsuarioUseCase usuarioUseCaseImpl(){
        return new UsuarioService();
    }

}
