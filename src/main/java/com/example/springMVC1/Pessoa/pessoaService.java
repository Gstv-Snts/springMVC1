package com.example.springMVC1.Pessoa;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class pessoaService {
    private final pessoaRepository pessoaRepository;
    @Autowired
    public pessoaService(com.example.springMVC1.Pessoa.pessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<pessoa> getPessoa(){
        return pessoaRepository.findAll();
    }

    public void registerPessoa(pessoa pessoa){
        if(pessoaRepository.findPessoaByName(pessoa.getName()).isPresent()){
            throw new IllegalStateException("Pessoa ja existe!");
        }
        System.out.println(pessoa);
        pessoaRepository.save(pessoa);
    }

    public void deletePessoa(Long id) {
        if (pessoaRepository.findById(id).isPresent()) {
            pessoaRepository.deleteById(id);
        } else {
            throw new IllegalStateException("Pessoa não existe!");
        }
    }
    @Transactional
    public void patchPessoa(Long id, pessoa pessoa){
        if(pessoaRepository.findById(id).isPresent()){
            pessoa user = pessoaRepository.getById(id);
            System.out.println(user);
            System.out.println(pessoa);
            pessoa.getName();
            pessoa.getAge();
            user.setName(pessoa.getName());
            user.setAge(pessoa.getAge());
        }else{
            throw new IllegalStateException("Pessoa não existe!");
        }
    }
}
