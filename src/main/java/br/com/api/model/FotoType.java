package br.com.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FotoType {
    PERFIL("Perfil"),
    CORPO("Corpo"),
    ;

    private String message;
}