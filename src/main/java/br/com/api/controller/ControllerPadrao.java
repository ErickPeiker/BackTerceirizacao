package br.com.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Set;

public interface ControllerPadrao<T, DTO, FILTER> {

    public ResponseEntity<T> save(@RequestBody DTO dto);

    public ResponseEntity<T> edit(@RequestBody DTO dto);

    public ResponseEntity<Set<T>> getAll(FILTER filter);

    public ResponseEntity<T> getId(@PathVariable("id") Long id);

}
