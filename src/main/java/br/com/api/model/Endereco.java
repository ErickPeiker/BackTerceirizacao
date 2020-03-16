package br.com.api.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco_generator")
    @SequenceGenerator(name="endereco_generator", sequenceName = "zseq_endereco")
    private Long id;
    private String descricao;
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;
}
