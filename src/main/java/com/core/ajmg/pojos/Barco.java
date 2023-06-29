package com.core.ajmg.pojos;

import com.core.ajmg.impl.Navegable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Slf4j
@Primary
@Component
public class Barco implements Navegable {
    @Override
    public void navegar() {
        log.info("Soy un barco navegando");
    }
}
