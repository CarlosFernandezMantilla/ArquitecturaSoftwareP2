package ec.edu.espe.examen.services;

import ec.edu.espe.examen.dto.createUsuarioDTO;
import ec.edu.espe.examen.entities.Simulacion;
import ec.edu.espe.examen.entities.Usuario;

import java.util.UUID;

public interface SimulacionService {

    Simulacion create(createUsuarioDTO dto);
    Simulacion update(createUsuarioDTO dto);
    Simulacion delete(createUsuarioDTO dto);
    Simulacion getById(UUID id);

}
