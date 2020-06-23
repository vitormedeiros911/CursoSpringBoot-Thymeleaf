package com.example.demo.web.conversor;

import com.example.demo.domain.Departamento;
import com.example.demo.service.DepartamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToDepartamentoiConverter implements Converter<String, Departamento> {

  @Autowired
  private DepartamentoService service;

  @Override
  public Departamento convert(String text) {
    if (text.isEmpty()) {
      return null;
    }
    Long id = Long.valueOf(text);
    return service.buscarPorId(id);
  }
}
