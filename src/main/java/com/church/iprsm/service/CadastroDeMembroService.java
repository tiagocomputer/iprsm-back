package com.church.iprsm.service;

import com.church.iprsm.entity.CadastroDeMembro;
import com.church.iprsm.repsitory.CadastroDeMembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroDeMembroService {

    @Autowired
    CadastroDeMembroRepository cadastroDeMembroRepository;
    @Autowired
    MongoTemplate mongoTemplate;

    public CadastroDeMembro salvarMembro(CadastroDeMembro membro) {
        return cadastroDeMembroRepository.save(membro);

    }

    public List<CadastroDeMembro> listarMembros() {
        return cadastroDeMembroRepository.findAll();
    }

    public CadastroDeMembro buscarMembroPorNome(String nome) {
        return cadastroDeMembroRepository.findFirstByNomeIgnoreCaseContaining(nome);
    }
}
