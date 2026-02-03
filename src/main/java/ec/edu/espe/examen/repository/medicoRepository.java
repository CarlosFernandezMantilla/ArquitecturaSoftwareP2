package ec.edu.espe.examen.repository;

import ec.edu.espe.examen.entities.medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface medicoRepository extends JpaRepository<medico, UUID> {
}
