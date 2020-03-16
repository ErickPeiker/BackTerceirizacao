package br.com.api.component;

import br.com.api.dto.TerceiroDTO;
import br.com.api.model.Terceiro;
import org.springframework.stereotype.Component;

@Component
public class TerceiroConverter {

    public Terceiro criarTerceiroDoDto(TerceiroDTO terceiroDTO) {
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

    public void atualizarTerceiroComDto(Terceiro terceiro, TerceiroDTO terceiroDTO) {
        terceiro.setNome(terceiroDTO.getNome());
        terceiro.setCpf(terceiroDTO.getCpf());
        terceiro.setRg(terceiroDTO.getRg());
        terceiro.setDrt(terceiroDTO.getDrt());
        terceiro.setCnv(terceiroDTO.getCnv());
        terceiro.setCursoSeguranca(terceiroDTO.getCursoSeguranca());
        terceiro.setGrandesEventos(terceiroDTO.getGrandesEventos());
        terceiro.setEnderecos(terceiroDTO.getEnderecos());
        terceiro.setOcupacoes(terceiroDTO.getOcupacoes());
        terceiro.setFotos(terceiroDTO.getFotos());
        terceiro.setTelefones(terceiroDTO.getTelefones());
        terceiro.setDisponibilidade(terceiroDTO.getDisponibilidade());
    }

}
