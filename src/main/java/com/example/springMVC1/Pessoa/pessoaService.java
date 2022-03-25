package com.example.springMVC1.Pessoa;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class pessoaService {
    public List<pessoa> getStudents(){
        return List.of(
                new pessoa(3L,
                        "Gustavo",
                        20)
        );
    }
}
