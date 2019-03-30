package com.lucien.crud.Services;

import java.util.List;
import com.lucien.crud.Models.*;

public interface IPessoaService{
    
    public List<Pessoa> getAllPessoas();

    public Pessoa getPessoaById(long id);
    
    public void saveorUpdate(Pessoa article);

    public void deletePessoa(long id);
}