package br.com.api.service;

import br.com.api.component.EmpresaConverter;
import br.com.api.dto.EmpresaDTO;
import br.com.api.dto.EmpresaFilterDTO;
import br.com.api.model.Empresa;
import br.com.api.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaConverter empresaConverter;

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public Empresa save(EmpresaDTO empresaDTO) {
        return empresaRepository.save(empresaConverter.criarDoDto(empresaDTO));
    }

    @Override
    public Empresa edit(EmpresaDTO empresaDTO) {
        Empresa empresa = getEmpresa(empresaDTO.getId()).get();
        empresaConverter.atualizarComDto(empresa, empresaDTO);
        return empresaRepository.save(empresa);
    }

    @Override
    public Set<Empresa> getEmpresas(EmpresaFilterDTO empresaFilterDTO) {
        return new HashSet<>(empresaRepository.findAll());
    }

    @Override
    public Optional<Empresa> getEmpresa(Long id) {
        return empresaRepository.findById(id);
    }
}
