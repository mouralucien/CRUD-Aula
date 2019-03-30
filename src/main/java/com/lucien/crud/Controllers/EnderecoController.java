package com.lucien.crud.Controllers;

import com.lucien.crud.Models.Endereco;
import com.lucien.crud.Models.Pessoa;
import com.lucien.crud.Services.EnderecoService;
import com.lucien.crud.Services.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;

@Controller
public class EnderecoController{

    @Autowired
    EnderecoService endereco_service;
    @Autowired
    PessoaService person_service;


    @RequestMapping(value = "/pessoa/{id}/endereco/create" , method = RequestMethod.GET)
    public String CreateEndereco(Model model, @PathVariable("id") long id){
        Pessoa estaPessoa = person_service.getPessoaById(id);
        Set<Endereco> enderecos = estaPessoa.getEnderecos();
        model.addAttribute("enderecos", estaPessoa.getEnderecos());
        model.addAttribute("pessoa_id", id);
        return "create_endereco";
    }

    /**
     * Action para a tela de criacao de Pessoa
     * @param model
     * @return
     */
    @RequestMapping(value = "/endereco/create" , method = RequestMethod.POST)
    public String CreateEndereco(Endereco obj, Model model){
        Pessoa estaPessoa = person_service.getPessoaById(obj.getPessoa_id());
        endereco_service.saveorUpdate(obj);
        estaPessoa.getEnderecos().add(obj);
        obj.setPessoa(estaPessoa);
        person_service.saveorUpdate(estaPessoa);
        return "redirect:/pessoa/" + obj.getPessoa_id() + "/endereco/create";
    }     
}

