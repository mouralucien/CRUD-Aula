package com.lucien.crud.Services;

import java.util.List;
import com.lucien.crud.Models.*;

public interface IEnderecoService{
    
    public List<Endereco> getAllEndereco();

    public Endereco getEnderecoById(long id);
    
    public void saveorUpdate(Endereco article);

    public void deleteEndereco(long id);
}