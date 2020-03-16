package br.com.api.controller;

import br.com.api.dto.EmpresaDTO;
import br.com.api.dto.EmpresaFilterDTO;
import br.com.api.model.Empresa;
import br.com.api.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost")
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public ResponseEntity<Empresa> save(@RequestBody EmpresaDTO empresaDTO) {
        return ResponseEntity.ok(empresaService.save(empresaDTO));
    }

    @PutMapping
    public ResponseEntity<Empresa> edit(@RequestBody EmpresaDTO empresaDTO) {
        return ResponseEntity.ok(empresaService.edit(empresaDTO));
    }

    @GetMapping
    public ResponseEntity<Set<Empresa>> getEmpresas(EmpresaFilterDTO empresaFilterDTO) {
        return ResponseEntity.ok(empresaService.getEmpresas(empresaFilterDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> getEmpresa(@PathVariable("id") Long id) {
        Optional<Empresa> empresa = empresaService.getEmpresa(id);
        return ResponseEntity.of(empresa);
    }

}
