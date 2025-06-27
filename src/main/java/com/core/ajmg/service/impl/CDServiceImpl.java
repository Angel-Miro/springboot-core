package com.core.ajmg.service.impl;

import com.core.ajmg.dao.CdDAO;
import com.core.ajmg.dto.CdDto;
import com.core.ajmg.entities.CD;
import com.core.ajmg.service.CDService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CDServiceImpl implements CDService {

    private final CdDAO cdDao ;


    @Override
    public List<CdDto> getAll() {
        List<CD> cds = cdDao.findAll();
        List<CdDto> cdDtos = new ArrayList<>();
        cds.stream().forEach(cd -> {
            CdDto cdDto = new CdDto();
            cdDto.setAnio(cd.getAnio());
            cdDto.setName(cd.getName());
            cdDto.setBand(cd.getBand());
            cdDtos.add(cdDto);
        });
        return cdDtos;
    }

    @Override
    public CdDto getByAnio(Integer anio) {
        return this.cdDao.findAll().stream().filter(cd -> cd.getAnio().equals(anio)).map(cd -> {
           CdDto cdDto = new CdDto();
           cdDto.setAnio(cd.getAnio());
           cdDto.setName(cd.getName());
           cdDto.setBand(cd.getBand());
           return cdDto;
        }).findFirst().orElse(null);
    }
}
