package ec.edu.espe.examen.dto;

import jakarta.validation.constraints.*;

public class createMedicoDTO {

    @NotBlank
    @Size(min = 1, max = 30)
    private String nombre;

    @NotBlank
    @Size(min = 1, max = 30)
    private String apellido;

    @NotBlank
    @Size(min = 1, max = 100)
    @Email
    private String email;

    @NotBlank
    @NotNull
    @Size(max = 30)
    private String telefono;

    @NotBlank
    @Size(min = 10, max = 50)
    private String especialidad;

    @NotBlank
    @NotNull
    @Size(min = 10, max = 50)
    private String registroProfesional;

    @NotBlank
    @Min(value = 0)
    @Max(value = 26)
    private int aniosExperiencia;

}
