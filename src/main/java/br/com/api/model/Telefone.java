package br.com.api.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "telefone_generator")
    @SequenceGenerator(name="telefone_generator", sequenceName = "telefone_seq")
    private Long id;
    private int ddd;
    private Long numTelefone;
}
