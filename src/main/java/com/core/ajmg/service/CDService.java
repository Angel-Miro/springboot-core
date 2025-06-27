package com.core.ajmg.service;

import com.core.ajmg.dto.CdDto;

import java.util.List;

public interface CDService {
    List<CdDto> getAll();
    CdDto getByAnio(Integer id);
}
