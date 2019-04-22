package com.church.iprsm.controller;

import com.church.iprsm.dto.CadastroDeMembroDTO;
import com.church.iprsm.entity.CadastroDeMembro;
import com.church.iprsm.service.CadastroDeMembroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/membro")
public class CadastroDeMembroController {
    @Autowired
    CadastroDeMembroService cadastroDeMembroService;

    @PostMapping("/cadastroDeMembro")
    public CadastroDeMembro cadastrarMembro(@RequestBody CadastroDeMembro membro) {

        return cadastroDeMembroService.salvarMembro(membro);
    }

    @GetMapping("/listaDeMembros")
    public List<CadastroDeMembro> listarMembros(){
        return cadastroDeMembroService.listarMembros();
    }

    @GetMapping("/nomeMembro/{nome}")
    public CadastroDeMembro buscarMembroPorNome(@PathVariable("nome") String nome){
        return cadastroDeMembroService.buscarMembroPorNome(nome);
    }


}
