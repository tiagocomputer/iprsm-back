package com.church.iprsm.repsitory;

import com.church.iprsm.entity.CadastroDeMembro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroDeMembroRepository extends MongoRepository<CadastroDeMembro, String> {
    CadastroDeMembro findFirstByNomeIgnoreCaseContaining(String nome);
}
