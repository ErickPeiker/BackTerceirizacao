package br.com.api.controller;

import br.com.api.dto.EventoDto;
import br.com.api.dto.EventoFilterDto;
import br.com.api.model.Evento;
import br.com.api.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost")
@RequestMapping("/evento")
public class EventoController implements ControllerPadrao<Evento, EventoDto, EventoFilterDto> {

    @Autowired
    EventoService eventoService;

    @Override
    public ResponseEntity<Evento> save(EventoDto eventoDto) {
        return ResponseEntity.ok(eventoService.save(eventoDto));
    }

    @Override
    public ResponseEntity<Evento> edit(EventoDto eventoDto) {
        return ResponseEntity.ok(eventoService.edit(eventoDto));
    }

    @Override
    public ResponseEntity<Set<Evento>> getAll(EventoFilterDto eventoFilterDto) {
        return ResponseEntity.ok(eventoService.getEventos(eventoFilterDto));
    }

    @Override
    public ResponseEntity<Evento> getId(Long id) {
        Optional<Evento> evento = eventoService.getEvento(id);
        return ResponseEntity.of(evento);
    }
}
