package br.com.api.dto;

import br.com.api.model.OcupacaoType;
import br.com.api.model.StatusType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TerceiroFilterDTO {
    private String nome;
    private String cpf;
    private StatusType status;
    private Boolean isVigilante;
    private Boolean hasGrandesEventos;
    private Set<OcupacaoType> ocupacoes;
}
