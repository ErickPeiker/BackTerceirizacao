package br.com.api.service;

import br.com.api.component.TerceiroConverter;
import br.com.api.dto.TerceiroDTO;
import br.com.api.dto.TerceiroFilterDTO;
import br.com.api.model.Terceiro;
import br.com.api.repository.TerceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class TerceiroServiceImpl implements TerceiroService {

    @Autowired
    private TerceiroConverter terceiroConverter;

    @Autowired
    private TerceiroRepository terceiroRepository;

    @Override
    public Terceiro save(TerceiroDTO terceiroDTO) {
        return terceiroRepository.save(terceiroConverter.criarDoDto(terceiroDTO));
    }

    @Override
    public Terceiro edit(TerceiroDTO terceiroDTO) {
        Terceiro terceiro = getTerceiro(terceiroDTO.getId()).get();
        terceiroConverter.atualizarComDto(terceiro, terceiroDTO);
        return terceiroRepository.save(terceiro);
    }

    @Override
    public Set<Terceiro> getTerceiros(TerceiroFilterDTO terceiroFilterDTO) {
        //TODO - Implantar os filtros
        return new HashSet<>(terceiroRepository.findAll());
    }

    @Override
    public Optional<Terceiro> getTerceiro(Long id) {
        return terceiroRepository.findById(id);
    }
}
