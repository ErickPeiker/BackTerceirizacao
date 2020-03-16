package br.com.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OcupacaoType {
    SERVICOS_GERAIS("Serviços Gerais"),
    SEGURANCA("Segurança"),
    SEGURANCA_GE("Segurança GE"),
    CONTROLADOR_ESTACIONAMENTO("Controlador Estacionamento"),
    COZINHA("Cozinha"),
    RECEPCIONISTA("Recepcionista"),
    BILHETAGEM("Bilhetagem"),
    ;

    private String message;
}
