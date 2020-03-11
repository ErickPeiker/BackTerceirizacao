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
@RequestMapping("/terceiro")
public class TerceiroController {

    @Autowired
    private TerceiroService terceiroService;

    @PostMapping
    public ResponseEntity<Terceiro> save(@RequestBody TerceiroDTO terceiroDTO) {
        return ResponseEntity.ok(terceiroService.save(terceiroDTO));
    }

    /*@PutMapping
    public ResponseEntity<Terceiro> edit(TerceiroDTO terceiroDTO) {
        return ResponseEntity.ok(terceiroService.edit(terceiroDTO));
    }
    */

    @GetMapping
    public ResponseEntity<Set<Terceiro>> getTerceiros(TerceiroFilterDTO terceiroFilterDTO) {
        return ResponseEntity.ok(terceiroService.getTerceiros(terceiroFilterDTO));
    }

    @GetMapping
    public ResponseEntity<Terceiro> getTerceiros(Long id) {
        Optional<Terceiro> terceiros = terceiroService.getTerceiro(id);
        return ResponseEntity.of(terceiros);
    }

}
