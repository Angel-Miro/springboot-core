package com.core.ajmg.pojos;

import com.core.ajmg.impl.Navegable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Nadador implements Navegable {
    @Override
    public void navegar() {
        log.info("Soy un nadador navegando");
    }
}
