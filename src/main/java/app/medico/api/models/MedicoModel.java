package app.medico.api.models;


import app.medico.api.medico.DadosMedicoCadastro;
import app.medico.api.medico.Especialidade;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;



@Table(name="medicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="ID")
@Entity
public class MedicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;



    @NotNull
    private  String email;


    @NotNull
    private  String nome;

    @NotNull
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;




    @OneToOne
    @JoinColumn(name="endereco_id")
    private EnderecoModel endereco;


    public MedicoModel(DadosMedicoCadastro dados) {
        this.nome=dados.nome();
        this.email= dados.email();
        this.crm=dados.crm();
        this.especialidade=dados.especialidade();
        this.endereco= new EnderecoModel(dados.endereco());
    }
}
