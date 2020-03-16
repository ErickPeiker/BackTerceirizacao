package br.com.api.component;

import br.com.api.dto.EventoDto;
import br.com.api.model.Evento;
import org.springframework.stereotype.Component;

@Component
public class EventoConverter implements ConverterPadrao<Evento, EventoDto>{

    @Override
    public Evento criarDoDto(EventoDto eventoDto) {
        return Evento.builder()
                .id(eventoDto.getId())
                .contratante(eventoDto.getContratante())
                .nome(eventoDto.getNome())
                .local(eventoDto.getLocal())
                .horario(eventoDto.getHorario())
                .escalas(eventoDto.getEscalas())
                .build()
                ;
    }

    @Override
    public void atualizarComDto(Evento evento, EventoDto eventoDto) {
        evento.setContratante(eventoDto.getContratante());
        evento.setNome(eventoDto.getNome());
        evento.setLocal(eventoDto.getLocal());
        evento.setHorario(eventoDto.getHorario());
        evento.setEscalas(eventoDto.getEscalas());
    }
}
