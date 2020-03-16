package br.com.api.component;

import br.com.api.dto.EmpresaDTO;
import br.com.api.model.Empresa;
import org.springframework.stereotype.Component;

@Component
public class EmpresaConverter implements ConverterPadrao<Empresa, EmpresaDTO> {

    public Empresa criarDoDto(EmpresaDTO empresaDTO) {
        return Empresa.builder()
                .id(empresaDTO.getId())
                .administrador(empresaDTO.getAdministrador())
                .razaoSocial(empresaDTO.getRazaoSocial())
                .nomeFantasia(empresaDTO.getNomeFantasia())
                .cnpj(empresaDTO.getCnpj())
                .enderecos(empresaDTO.getEnderecos())
                .telefones(empresaDTO.getTelefones())
                .eventos(empresaDTO.getEventos())
                .build();
    }

    public void atualizarComDto(Empresa empresa, EmpresaDTO empresaDTO) {
        empresa.setAdministrador(empresaDTO.getAdministrador());
        empresa.setCnpj(empresaDTO.getCnpj());
        empresa.setNomeFantasia(empresaDTO.getNomeFantasia());
        empresa.setRazaoSocial(empresaDTO.getRazaoSocial());
        empresa.setEnderecos(empresaDTO.getEnderecos());
        empresa.setTelefones(empresaDTO.getTelefones());
    }

}
