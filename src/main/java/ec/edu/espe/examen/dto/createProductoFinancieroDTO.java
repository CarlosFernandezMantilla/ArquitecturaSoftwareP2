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
public class createProductoFinancieroDTO {

        @NotNull
        private UUID id;

        @NotBlank
        @Size(min = 1, max = 50)
        private String nombre;

        @NotBlank
        @Size(min = 1, max = 200)
        private String descripcion;

        @NotNull
        @DecimalMin(value = "0.00", inclusive = true)
        @Digits(integer = 8, fraction = 2)
        private BigDecimal costo;

        @NotNull
        @DecimalMin(value = "0.00", inclusive = true)
        @Digits(integer = 3, fraction = 2)
        private BigDecimal porcentajeRetorno;

        @NotNull
        private Boolean activo;

}
