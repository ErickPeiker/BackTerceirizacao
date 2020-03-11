package br.com.api.component;

import br.com.api.dto.TerceiroDTO;
import br.com.api.model.Terceiro;
import org.springframework.stereotype.Component;

@Component
public class TerceiroConverter {

    public Terceiro convertDtoToTerceiro(TerceiroDTO terceiroDTO) {
        return Terceiro.builder()
                .nome(terceiroDTO.getNome())
                .cpf(terceiroDTO.getCpf())
                .rg(terceiroDTO.getRg())
                .drt(terceiroDTO.getDrt())
                .cnv(terceiroDTO.getCnv())
                .cursoSeguranca(terceiroDTO.getCursoSeguranca())
                .grandesEventos(terceiroDTO.getGrandesEventos())
                .enderecos(terceiroDTO.getEnderecos())
                .ocupacoes(terceiroDTO.getOcupacoes())
                .fotos(terceiroDTO.getFotos())
                .telefones(terceiroDTO.getTelefones())
                .disponibilidade(terceiroDTO.getDisponibilidade())
                .build();
    }

}
