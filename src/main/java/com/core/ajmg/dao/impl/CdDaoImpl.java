package com.core.ajmg.dao.impl;

import com.core.ajmg.dao.CdDAO;
import com.core.ajmg.entities.CD;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CdDaoImpl implements CdDAO {
    @Override
    public List<CD> findAll() {

        CD cd1 = new CD(1993, "Espiritu del vino", "Heores del Silencio", "Rock", "Sony", 1);
        CD cd2 = new CD(2005, "Defecto Perfecto", "División Minuscula", "Rock/Pop", "Sony", 1);
        CD cd3 = new CD(2007, "Tour 2007", "Heores del Silencio", "Rock", "Sony", 2);
        CD cd4 = new CD(2017, "WORTH NOTHING", "Fast & Furious", "Dance", "RCA", 1);
        CD cd5 = new CD(2022, "Un verano sin ti ", "Bad Bunny", "Urbano", "Sony", 1);

        return List.of(cd1, cd2, cd3, cd4, cd5);
    }
}
