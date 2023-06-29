package com.core.ajmg.services;

import com.core.ajmg.impl.Navegable;
import org.springframework.stereotype.Service;

@Service
public class PrimaryExampleService {

    /**
     * Podemos observar que se realiza la
     * inyección sin la necesidad del @Autowired
     * ya que se esta realizando por constructor
     */

    private final Navegable navegable;

    public PrimaryExampleService(Navegable navegable){
        this.navegable = navegable;
    }

    public void navega(){
        navegable.navegar();
    }
}
