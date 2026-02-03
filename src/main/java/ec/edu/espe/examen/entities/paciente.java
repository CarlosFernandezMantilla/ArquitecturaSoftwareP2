package ec.edu.espe.examen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class paciente extends persona {

    @Column(length = 50)
    private String seguro;

    @Column(length = 50)
    private String contactoEmergencia;

}
