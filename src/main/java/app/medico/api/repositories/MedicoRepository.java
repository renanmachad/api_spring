package app.medico.api.repositories;


import app.medico.api.models.MedicoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface MedicoRepository extends JpaRepository<MedicoModel, UUID> {

}
