package br.com.api.service;

import br.com.api.dto.TerceiroDTO;
import br.com.api.dto.TerceiroFilterDTO;
import br.com.api.model.Terceiro;

import java.util.Optional;
import java.util.Set;

public interface TerceiroService {

    public Terceiro save(TerceiroDTO terceiroDTO);

    public Terceiro edit(TerceiroDTO terceiroDTO);

    public Set<Terceiro> getTerceiros(TerceiroFilterDTO terceiroFilterDTO);

    public Optional<Terceiro> getTerceiro(Long id);
}
