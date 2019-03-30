package com.lucien.crud.Controllers;

import com.lucien.crud.Models.Pessoa;
import com.lucien.crud.Services.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;

@Controller
public class PersonController{

    @Autowired
    PessoaService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Home(Model model){
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String CreatePost(Pessoa obj, Model model){
        //Salvando
        service.saveorUpdate(obj);


        return "redirect:list";
    }        

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String Create(Model model){
        return "create";
    }    

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String List(Model model){
        //mostra tudo
        List<Pessoa> pessoaList = service.getAllPessoas();
        model.addAttribute("pessoas", pessoaList);
        return "list";
    }        

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String Delete(Pessoa obj){
        service.deletePessoa(obj.getId());
        return "redirect:list";
    }       

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String Update(Model model, @PathVariable("id") long id){
        Pessoa pessoa = service.getPessoaById(id);
        model.addAttribute("pessoa", pessoa);
        return "create";
    }           

}

