package br.com.api.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foto_generator")
    @SequenceGenerator(name="foto_generator", sequenceName = "zseq_foto")
    private Long id;
    @Enumerated(EnumType.STRING)
    private FotoType tipo;
    private String url;
}
