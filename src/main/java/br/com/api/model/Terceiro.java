package br.com.api.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Terceiro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "terceiro_generator")
    @SequenceGenerator(name="terceiro_generator", sequenceName = "zseq_terceiro")
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private String drt;
    private String cnv;
    private LocalDate cursoSeguranca;
    private LocalDate grandesEventos;

    @Enumerated(EnumType.STRING)
    private StatusType disponibilidade;

    @ElementCollection(targetClass=OcupacaoType.class)
    @Enumerated(EnumType.STRING)
    private Set<OcupacaoType> ocupacoes;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telefone> telefones;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Foto> fotos;

}
