package com.lucien.crud.Controllers.api;

import com.lucien.crud.Models.Pessoa;
import com.lucien.crud.Services.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@CrossOrigin(origins={
    "http://localhost:8090",
    "http://localhost:8082",        
    "http://127.0.0.1:8082"        
})
@RestController
@RequestMapping("/api/v1")
public class ApiPersonController{

    @Autowired
    PessoaService service;

    @RequestMapping(
        value    = "/pessoas",
        method   = RequestMethod.GET,
        produces = {"application/json"}
    )
    public List<Pessoa> Pessoas(){
        return service.getAllPessoas();

    }

    @RequestMapping(
        value    = "/pessoas",
        method   = RequestMethod.POST,
        produces = {"application/json"}
    )
    public void PessoasCreate(@RequestBody Pessoa p){
        service.saveorUpdate(p);

    }    

}

