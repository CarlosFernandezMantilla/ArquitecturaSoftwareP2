package ec.edu.espe.examen.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class createUsuarioDTO {

        @NotNull
        private UUID id;

        @NotBlank
        @Size(min = 1, max = 30)
        private String nombre;

        @NotBlank
        @Size(min = 1, max = 100)
        @Email
        private String email;

        @NotNull
        @DecimalMin(value = "0.00", inclusive = true)
        @Digits(integer = 8, fraction = 2)
        private BigDecimal capitalDisponible;

}
