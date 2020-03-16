package br.com.api.dto;

import br.com.api.model.Empresa;
import br.com.api.model.Escala;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventoDto {

    private Long id;
    private Empresa contratante;
    private String nome;
    private String local;
    private LocalDateTime horario;
    private Set<Escala> escalas;

}
