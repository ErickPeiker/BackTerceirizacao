package br.com.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusType {
    ATIVO("Ativo"),
    INATIVO("Inativo");

    private String message;
}
