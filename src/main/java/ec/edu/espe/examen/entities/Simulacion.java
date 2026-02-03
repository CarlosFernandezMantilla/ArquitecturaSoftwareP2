package ec.edu.espe.examen.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Simulacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Simulacion {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private UUID usuarioId;

    @Column(nullable = false)
    private LocalDateTime fechaSimulacion;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal capitalDisponible;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal gananciaTotal;

    @ManyToMany
    @JoinTable(
            name = "simulacion_producto",
            joinColumns = @JoinColumn(name = "simulacion_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id")
    )

    private List<ProductoFinanciero> productosSeleccionados;

}
