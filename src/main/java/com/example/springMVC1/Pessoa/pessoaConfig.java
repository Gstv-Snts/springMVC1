package com.example.springMVC1.Pessoa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class pessoaConfig {
    @Bean
    CommandLineRunner CommandCommandLineRunner(pessoaRepository repository){
        return args -> {
        };
    }
}
