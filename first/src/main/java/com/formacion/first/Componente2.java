package com.formacion.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Componente2 {
    @Autowired
    Componente1 componente1;

    public Componente2(Componente1 componente1) {
        this.componente1 = componente1;
    }

    public String saluda(){
        if (componente1 == null)
            return "Componente1 es nulo";
        else
            return "hola desde componente 2\n" + componente1.saludo();
    }
}
