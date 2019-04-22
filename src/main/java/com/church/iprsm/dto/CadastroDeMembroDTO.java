package com.church.iprsm.dto;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CadastroDeMembroDTO {

    @Id
    private String id;
    private String nome;
    private String telefone;
    private String email;
    private String celular;
    private String cep;
    private String cidade;
    private String estado;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;
    private String localNascimento;
    private String estadoNascimento;
    private String estadoCivil;
    private String nomeConjugue;
    private String nomeDoPai;
    private String nomeDaMae;

    public CadastroDeMembroDTO() {
    }

    public CadastroDeMembroDTO(String id, String nome, String telefone, String email, String celular, String cep, String cidade, String estado, Date dataNascimento, String localNascimento, String estadoNascimento, String estadoCivil, String nomeConjugue, String nomeDoPai, String nomeDaMae) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.celular = celular;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.dataNascimento = dataNascimento;
        this.localNascimento = localNascimento;
        this.estadoNascimento = estadoNascimento;
        this.estadoCivil = estadoCivil;
        this.nomeConjugue = nomeConjugue;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getEstadoNascimento() {
        return estadoNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNomeConjugue() {
        return nomeConjugue;
    }

    public void setNomeConjugue(String nomeConjugue) {
        this.nomeConjugue = nomeConjugue;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }
}
