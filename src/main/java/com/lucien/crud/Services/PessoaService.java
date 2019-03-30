package com.lucien.crud.Services;

import java.util.List;

import com.lucien.crud.Models.Pessoa;
import com.lucien.crud.Repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService implements IPessoaService {

    @Autowired
    PessoaRepository repo;

    @Override
    public List<Pessoa> getAllPessoas() {
        return (List<Pessoa>) repo.findAll();
    }

    @Override
    public Pessoa getPessoaById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public void saveorUpdate(Pessoa obj) {
        repo.save(obj);
    }

    @Override
    public void deletePessoa(long id) {
        repo.deleteById(id);
    }


}