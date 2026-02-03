package ec.edu.espe.examen.services;

import ec.edu.espe.examen.dto.createUsuarioDTO;
import ec.edu.espe.examen.entities.ProductoFinanciero;
import ec.edu.espe.examen.entities.Usuario;

import java.util.UUID;

public interface ProductoFinancieroService {

    ProductoFinanciero create(createUsuarioDTO dto);
    ProductoFinanciero update(createUsuarioDTO dto);
    ProductoFinanciero delete(createUsuarioDTO dto);
    ProductoFinanciero getById(UUID id);

}
