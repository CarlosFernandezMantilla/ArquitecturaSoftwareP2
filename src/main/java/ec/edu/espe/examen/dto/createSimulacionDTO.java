package ec.edu.espe.examen.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class createSimulacionDTO {

    @NotNull
    private UUID id;

    @NotNull
    private UUID usuarioId;

    @NotNull
    private LocalDateTime fechaSimulacion;

    @NotNull
    @DecimalMin(value = "0.00", inclusive = true)
    @Digits(integer = 8, fraction = 2)
    private BigDecimal capitalDisponible;

    @NotNull
    @DecimalMin(value = "0.00", inclusive = true)
    @Digits(integer = 8, fraction = 2)
    private BigDecimal gananciaTotal;

    @NotEmpty
    private List<UUID> productosSeleccionados;

}
