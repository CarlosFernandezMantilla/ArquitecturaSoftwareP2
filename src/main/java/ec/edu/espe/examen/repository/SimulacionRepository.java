package ec.edu.espe.examen.repository;

import ec.edu.espe.examen.entities.Simulacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SimulacionRepository extends JpaRepository<Simulacion, UUID> {
}
