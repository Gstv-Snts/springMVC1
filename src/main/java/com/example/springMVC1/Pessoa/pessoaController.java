package com.example.springMVC1.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<pessoa> getPessoa(){
        return pessoaService.getPessoa();
    }
    @PostMapping
    public void registerPessoa(@RequestBody pessoa pessoa){
        pessoaService.registerPessoa(pessoa);
    }
    @DeleteMapping(path = "{pessoaId}")
    public void deletePessoa(@PathVariable("pessoaId") Long id){
        pessoaService.deletePessoa(id);
    }
    @PutMapping(path = "{pessoaId}")
    public void patchPessoa(@PathVariable("pessoaId") Long id,@RequestBody pessoa pessoa){
        pessoaService.patchPessoa(id, pessoa);
    }

}
