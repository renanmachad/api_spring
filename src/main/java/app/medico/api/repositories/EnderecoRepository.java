package app.medico.api.repositories;

import app.medico.api.models.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public  interface EnderecoRepository extends JpaRepository<EnderecoModel, UUID> {

}
