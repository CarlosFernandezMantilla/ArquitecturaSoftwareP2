package ec.edu.espe.examen.services;

import ec.edu.espe.examen.dto.createMedicoDTO;
import ec.edu.espe.examen.entities.medico;

import java.util.UUID;

public interface medicoService {
    medico Create(createMedicoDTO dto);
    medico getById(UUID id);
}
