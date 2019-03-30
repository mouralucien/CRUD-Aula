package com.lucien.crud.Repositories;

import com.lucien.crud.Models.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}

