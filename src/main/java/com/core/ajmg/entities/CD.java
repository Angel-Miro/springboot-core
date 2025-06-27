package com.core.ajmg.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CD {
    private Integer anio;
    private String name;
    private String band;
    private String gender;
    private String discography;
    private Integer numberCds;
}
