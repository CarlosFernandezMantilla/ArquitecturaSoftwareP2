package ec.edu.espe.examen.repository;

import ec.edu.espe.examen.entities.ProductoFinanciero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductoFinancieroRepository extends JpaRepository<ProductoFinanciero, UUID> {

}
