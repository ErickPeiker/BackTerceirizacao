package br.com.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OcupacaoType {
    VIGILANTE("Vigilante"),
    COZINHEIRO("Cozinheiro"),
    RECEPCIONISTA("Recepcionista"),
    BILHETAGEM("Bilhetagem"),
    ;

    private String message;
}
