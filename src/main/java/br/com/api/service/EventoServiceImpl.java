package br.com.api.service;

import br.com.api.component.EventoConverter;
import br.com.api.dto.EventoDto;
import br.com.api.dto.EventoFilterDto;
import br.com.api.model.Evento;
import br.com.api.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private EventoConverter eventoConverter;

    @Override
    public Evento save(EventoDto eventoDTO) {
        return eventoRepository.save(eventoConverter.criarDoDto(eventoDTO));
    }

    @Override
    public Evento edit(EventoDto eventoDto) {
        Evento evento = getEvento(eventoDto.getId()).get();
        eventoConverter.atualizarComDto(evento, eventoDto);
        return eventoRepository.save(evento);
    }

    @Override
    public Set<Evento> getEventos(EventoFilterDto eventoFilterDto) {
        //TODO - Implantar os filtros
        return new HashSet<>(eventoRepository.findAll());
    }

    @Override
    public Optional<Evento> getEvento(Long id) {
        return eventoRepository.findById(id);
    }
}
