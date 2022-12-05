package app.medico.api.medico;

import app.medico.api.endereco.DadosEndereco;

public record DadosMedicoCadastro(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
