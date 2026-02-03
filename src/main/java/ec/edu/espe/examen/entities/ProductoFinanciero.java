package ec.edu.espe.examen.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "ProductoFinanciero")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoFinanciero {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal costo;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal porcentaje_retorno;

    @Column(nullable = false)
    private Boolean activo;

}
