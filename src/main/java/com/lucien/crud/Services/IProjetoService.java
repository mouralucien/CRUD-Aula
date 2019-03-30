package com.lucien.crud.Services;

import java.util.List;
import com.lucien.crud.Models.*;

public interface IProjetoService{
    
    public List<Projeto> getAllProjeto();

    public Projeto getProjetoById(long id);
    
    public Projeto getProjetoByCodigo(long codigo);    
    
    public void saveorUpdate(Projeto article);

    public void deleteProjeto(long id);
}