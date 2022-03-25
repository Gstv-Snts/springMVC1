package com.example.springMVC1.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/pessoa")
public class pessoaController {
    private final pessoaService pessoaService;
    @Autowired
    public pessoaController(pessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public List<pessoa> getStudent(){
        return pessoaService.getStudents();
    }

}
