package br.com.api.service;

import br.com.api.dto.EventoDto;
import br.com.api.dto.EventoFilterDto;
import br.com.api.model.Evento;

import java.util.Optional;
import java.util.Set;

public interface EventoService {

    public Evento save(EventoDto eventoDTO);

    public Evento edit(EventoDto eventoDto);

    public Set<Evento> getEventos(EventoFilterDto eventoFilterDto);

    public Optional<Evento> getEvento(Long id);

}
