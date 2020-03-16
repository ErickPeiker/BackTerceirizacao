package br.com.api.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "terceiro_generator")
    @SequenceGenerator(name="terceiro_generator", sequenceName = "zseq_terceiro")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa contratante;
    private String nome;
    private String local;
    private LocalDateTime horario;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Escala> escalas;
}
