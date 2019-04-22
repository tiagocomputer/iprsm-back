package com.church.iprsm.convertDtoAndEntity;

import com.church.iprsm.dto.CadastroDeMembroDTO;
import com.church.iprsm.entity.CadastroDeMembro;
import org.modelmapper.ModelMapper;

public class CadastroDeMembrosConversor {
    CadastroDeMembro cadastroDeMembro = new CadastroDeMembro();

    ModelMapper modelMapper = new ModelMapper();
    CadastroDeMembroDTO cadastroDeMembroDTO = modelMapper.map(cadastroDeMembro, CadastroDeMembroDTO.class);
}

