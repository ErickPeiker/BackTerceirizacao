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
public class Escala {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "escala_generator")
    @SequenceGenerator(name="escala_generator", sequenceName = "zseq_escala")
    private Long id;

    private Integer quantidadeTerceiros;

    @ElementCollection(targetClass=OcupacaoType.class)
    @Enumerated(EnumType.STRING)
    private Set<OcupacaoType> ocupacoes;

    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Double valorPadrao;

}
