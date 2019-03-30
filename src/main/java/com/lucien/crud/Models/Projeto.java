package com.lucien.crud.Models;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

@Entity
public class Projeto implements Serializable{
    private static final long serialVersionUID = -5294188737237640015L;


    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;

    @ManyToMany(mappedBy = "projetos")
    private Set<Pessoa> Pessoas;    

    private long codigo;
    private Date dtentrega;
    private Date dtinicio;
    private String nome;
    private int orcamento;

    @Override
    public boolean equals(Object p){
        return this.codigo == ((Projeto)p).getCodigo() ? true : false;
    }


    /**
     * @return Long return the Id
     */
    public Long getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * @return Date return the dtentrega
     */
    public Date getDtentrega() {
        return dtentrega;
    }

    /**
     * @param dtentrega the dtentrega to set
     */
    public void setDtentrega(Date dtentrega) {
        this.dtentrega = dtentrega;
    }

    /**
     * @return Date return the dtinicio
     */
    public Date getDtinicio() {
        return dtinicio;
    }

    /**
     * @param dtinicio the dtinicio to set
     */
    public void setDtinicio(Date dtinicio) {
        this.dtinicio = dtinicio;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the orcamento
     */
    public int getOrcamento() {
        return orcamento;
    }

    /**
     * @param orcamento the orcamento to set
     */
    public void setOrcamento(int orcamento) {
        this.orcamento = orcamento;
    }


    /**
     * @return Set<Pessoa> return the Pessoas
     */
    public Set<Pessoa> getPessoas() {
        return Pessoas;
    }

    /**
     * @param Pessoas the Pessoas to set
     */
    public void setPessoas(Set<Pessoa> Pessoas) {
        this.Pessoas = Pessoas;
    }

    /**
     * @return String return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param string the codigo to set
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

}