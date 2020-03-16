package br.com.api.service;

import br.com.api.dto.EmpresaDTO;
import br.com.api.dto.EmpresaFilterDTO;
import br.com.api.model.Empresa;

import java.util.Optional;
import java.util.Set;

public interface EmpresaService {

    public Empresa save(EmpresaDTO terceiroDTO);

    public Empresa edit(EmpresaDTO terceiroDTO);

    public Set<Empresa> getEmpresas(EmpresaFilterDTO empresaFilterDTO);

    public Optional<Empresa> getEmpresa(Long id);
}
