package com.core.ajmg.controller;

import com.core.ajmg.dto.CdDto;
import com.core.ajmg.service.CDService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cd")
@RestController
@AllArgsConstructor
public class CdsController {

    private final CDService cdService;

    @GetMapping("/get-all")
    public List<CdDto> getCds() {
        return cdService.getAll();
    }

    @GetMapping("/get-cd-request-param")
    public CdDto getCdsByRequestParam(@RequestParam(required = false, defaultValue = "1993") Integer anio) {
        return  this.cdService.getByAnio(anio);
    }

    @GetMapping("/get-cd-path-variable/{anio}")
    public CdDto getCdsByPathVariable(@PathVariable Integer anio) {
        return  this.cdService.getByAnio(anio);
    }


}
