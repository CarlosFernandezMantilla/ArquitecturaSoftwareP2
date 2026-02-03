package ec.edu.espe.examen.services.impl;

import ec.edu.espe.examen.dto.createPacienteDTO;
import ec.edu.espe.examen.entities.paciente;
import ec.edu.espe.examen.repository.pacienteRepository;
import ec.edu.espe.examen.services.pacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class pacienteServiceImpl implements pacienteService {

    @Autowired
    private pacienteRepository repository;

    @Override
    public paciente create(createPacienteDTO dto) {
        paciente paciente = new paciente();
        paciente.setIdentificacion(dto.getIdentificacion());
        paciente.setNombre(dto.getNombre());
        paciente.setApellido(dto.getIdentificacion());
        paciente.setEmail(dto.getIdentificacion());
        paciente.setTelefono(dto.getTelefono());
        paciente.setSeguro(dto.getSeguro());
        paciente.setContactoEmergencia((dto.getContactoEmergencia()));
        return repository.save(paciente);
    }

    @Override
    public paciente getById(UUID id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Paciente no encontrado"));
    }

    @Override
    public paciente getByIdentificacion(String identificacion) {
        return null;
    }
}
