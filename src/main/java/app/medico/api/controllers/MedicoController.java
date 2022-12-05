package app.medico.api.controllers;

import app.medico.api.medico.DadosMedicoCadastro;
import app.medico.api.repositories.EnderecoRepository;
import app.medico.api.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import app.medico.api.models.MedicoModel;

@RestController
@RequestMapping("api/medicos")
public class MedicoController {


    @Autowired
    private MedicoRepository repository;

    @Autowired
    private EnderecoRepository repositoryEndereco;

    @PostMapping
    @Transactional
    public void Cadastro(@RequestBody DadosMedicoCadastro dados){
        repositoryEndereco.save(dados.endereco());
        System.out.println(dados);
        //repository.save(new MedicoModel(dados)) ;

    }
}
