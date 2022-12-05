package app.medico.api.models;

import app.medico.api.endereco.DadosEndereco;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Table(name="enderecos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="ID")
@Entity
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;

    private String logradouro;
    private String bairro;
    private String cep;
    private int numero;
    private String uf;
    private String complemento;

    private String cidade;

    public EnderecoModel(DadosEndereco endereco) {
        this.bairro= endereco.bairro();
        this.cep=endereco.cep();
        this.cidade=endereco.cidade();
        this.uf=endereco.uf();
        this.complemento= endereco.complemento();
        this.logradouro= endereco.logradouro();
        this.numero= endereco.numero();

    }
}
