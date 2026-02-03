package ec.edu.espe.examen.repository;

import ec.edu.espe.examen.entities.paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface pacienteRepository extends JpaRepository<paciente, UUID> {
}
