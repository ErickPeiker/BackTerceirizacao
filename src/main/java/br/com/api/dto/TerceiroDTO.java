package br.com.api.dto;

import br.com.api.model.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TerceiroDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private String drt;
    private String cnv;
    private LocalDate cursoSeguranca;
    private LocalDate grandesEventos;
    private StatusType disponibilidade;
    private Set<OcupacaoType> ocupacoes;
    private Set<Endereco> enderecos;
    private Set<Foto> fotos;
    private Set<Telefone> telefones;
}
