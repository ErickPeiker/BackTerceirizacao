package br.com.api.dto;

import br.com.api.model.Endereco;
import br.com.api.model.Evento;
import br.com.api.model.Telefone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaDTO {

    private Long id;

    private String administrador;

    private String razaoSocial;

    private String nomeFantasia;

    private String cnpj;

    private Set<Endereco> enderecos;

    private Set<Telefone> telefones;

    private Set<Evento> eventos;

}
