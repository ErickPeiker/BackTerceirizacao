package br.com.api.controller;

import br.com.api.dto.TerceiroDTO;
import br.com.api.dto.TerceiroFilterDTO;
import br.com.api.model.Terceiro;
import br.com.api.service.TerceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost")
@RequestMapping("/terceiro")
public class TerceiroController implements ControllerPadrao<Terceiro, TerceiroDTO, TerceiroFilterDTO>{

    @Autowired
    private TerceiroService terceiroService;

    @PostMapping
    public ResponseEntity<Terceiro> save(@RequestBody TerceiroDTO terceiroDTO) {
        return ResponseEntity.ok(terceiroService.save(terceiroDTO));
    }

    @PutMapping
    public ResponseEntity<Terceiro> edit(@RequestBody TerceiroDTO terceiroDTO) {
        return ResponseEntity.ok(terceiroService.edit(terceiroDTO));
    }

    @GetMapping
    public ResponseEntity<Set<Terceiro>> getAll(TerceiroFilterDTO terceiroFilterDTO) {
        return ResponseEntity.ok(terceiroService.getTerceiros(terceiroFilterDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Terceiro> getId(@PathVariable("id") Long id) {
        Optional<Terceiro> terceiro = terceiroService.getTerceiro(id);
        return ResponseEntity.of(terceiro);
    }

}
