package ec.edu.espe.examen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "medico")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class medico extends persona {

    @Column(nullable = false, length = 50)
    private String especialidad;

    @Column(nullable = true)
    private int aniosExperiencia;

}
