package com.example.springMVC1.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface pessoaRepository extends JpaRepository<pessoa, Long> {
    Optional<pessoa> findPessoaByName(String name);
}
