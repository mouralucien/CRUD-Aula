package com.lucien.crud;

import com.lucien.crud.Models.Projeto;
import com.lucien.crud.Services.PessoaService;
import com.lucien.crud.Services.ProjetoService;
import com.lucien.crud.Services.IProjetoService;

import org.h2.command.dml.Insert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	ProjetoService service;
	

	@Test
	public void contextLoads() {
	}

}

