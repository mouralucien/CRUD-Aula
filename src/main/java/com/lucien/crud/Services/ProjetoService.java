package com.lucien.crud.Services;

import java.util.List;

import com.lucien.crud.Models.Projeto;
import com.lucien.crud.Repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetoService implements IProjetoService {

    @Autowired
    ProjetoRepository repo;

    @Override
    public List<Projeto> getAllProjeto() {
        return (List<Projeto>) repo.findAll();
    }

    @Override
    public Projeto getProjetoById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public Projeto getProjetoByCodigo(long codigo) {
        return repo.findById(codigo).get();
    }    

    @Override
    public void saveorUpdate(Projeto obj) {
        repo.save(obj);
    }

    @Override
    public void deleteProjeto(long id) {
        repo.deleteById(id);
    }


}