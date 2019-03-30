package com.lucien.crud.Services;

import java.util.List;

import com.lucien.crud.Models.Endereco;
import com.lucien.crud.Repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService implements IEnderecoService {

    @Autowired
    EnderecoRepository repo;

    @Override
    public List<Endereco> getAllEndereco() {
        return (List<Endereco>) repo.findAll();
    }

    @Override
    public Endereco getEnderecoById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public void saveorUpdate(Endereco obj) {
        repo.save(obj);
    }

    @Override
    public void deleteEndereco(long id) {
        repo.deleteById(id);
    }


}