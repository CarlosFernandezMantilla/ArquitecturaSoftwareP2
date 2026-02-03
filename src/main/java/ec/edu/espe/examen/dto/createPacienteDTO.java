package ec.edu.espe.examen.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class createPacienteDTO {

    @NotNull
    @Size(max = 10)
    private String identificacion;

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
    private String seguro;

    @NotBlank
    @Size(min = 10, max = 50)
    private String contactoEmergencia;

}
