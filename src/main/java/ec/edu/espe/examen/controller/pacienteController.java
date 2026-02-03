package ec.edu.espe.examen.controller;

import ec.edu.espe.examen.dto.createPacienteDTO;
import ec.edu.espe.examen.entities.paciente;
import ec.edu.espe.examen.services.pacienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/pacientes")
public class pacienteController {

    @Autowired
    private pacienteService service;

    @PostMapping("/")
    public paciente create(@Valid @RequestBody createPacienteDTO dto){
        return service.create(dto);
    }

    @GetMapping("/{id}")
    public paciente getById(@PathVariable UUID id){
        return service.getById(id);
    }

}
