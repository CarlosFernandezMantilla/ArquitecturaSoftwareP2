package ec.edu.espe.examen.services;

import ec.edu.espe.examen.dto.createPacienteDTO;
import ec.edu.espe.examen.entities.paciente;

import java.util.UUID;

public interface pacienteService {
    paciente create(createPacienteDTO dto);
    paciente getById(UUID id);
    paciente getByIdentificacion(String identificacion);
}
