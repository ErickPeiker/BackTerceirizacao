package br.com.api.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empresa_generator")
    @SequenceGenerator(name="empresa_generator", sequenceName = "zseq_empresa")
    private Long id;

    private String administrador;

    private String razaoSocial;

    private String nomeFantasia;

    private String cnpj;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telefone> telefones;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "contratante")
    private Set<Evento> eventos;

}
