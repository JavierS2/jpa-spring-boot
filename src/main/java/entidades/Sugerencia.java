package entidades;

import java.time.LocalDateTime;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Sugerencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descripcion;

    @Temporal(TemporalType.TIME)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

}
