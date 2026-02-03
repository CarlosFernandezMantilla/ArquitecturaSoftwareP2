package ec.edu.espe.examen.services;

import ec.edu.espe.examen.dto.createUsuarioDTO;
import ec.edu.espe.examen.entities.Usuario;

import java.util.UUID;

public interface UsuarioService {

    Usuario create(createUsuarioDTO dto);
    Usuario update(createUsuarioDTO dto);
    Usuario delete(createUsuarioDTO dto);
    Usuario getById(UUID id);

}
