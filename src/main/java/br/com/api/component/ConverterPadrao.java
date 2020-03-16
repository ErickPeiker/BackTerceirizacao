package br.com.api.component;

public interface ConverterPadrao<T, DTO> {

    T criarDoDto(DTO dto);

    public void atualizarComDto(T entity, DTO dto);

}
