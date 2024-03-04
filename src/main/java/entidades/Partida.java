package entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "partidas")
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPartida;

    @Column(nullable = false)
    private String creador;

    @Column(nullable = false)
    private String deporte;

    @Column(nullable = false)
    private String ciudad;

    @Column(nullable = false)
    private String provincia;

    @Temporal(TemporalType.DATE)
    private LocalDate fecha;

    @Temporal(TemporalType.TIME)
    private LocalTime horaComienzo;

    @Temporal(TemporalType.TIME)
    private LocalTime horaFinal;

    @Column(nullable = false)
    private Integer participantes;

    @Column(nullable = false)
    private String comentarios;

    @ManyToMany
    @JoinTable(name = "usuarios_partidas", joinColumns = @JoinColumn(name = "idPartida", referencedColumnName = "idPartida"), inverseJoinColumns = @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario"))
    private List<Usuario> suplentes;

}
