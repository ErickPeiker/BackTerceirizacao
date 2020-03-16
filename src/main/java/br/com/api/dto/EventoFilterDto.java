package br.com.api.dto;

import br.com.api.model.Empresa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventoFilterDto {

    private Empresa contratante;
    private String nome;
    private String local;
    private LocalDateTime horario;

}
