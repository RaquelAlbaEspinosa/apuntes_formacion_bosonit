package com.formacion.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {
    @Autowired
    private ConfiguracionBeans configuracionBeans;
    @Autowired
    Componente1 componente1;

    @Autowired
    Componente2 componente2;

    @GetMapping("/")
    public String hola(Componente1 getComponente1, ConfiguracionBeans configuracionBeans, @NonNull Componente2 componente2){
        this.componente1 = getComponente1;
        this.componente2 = componente2;
        System.out.println(componente1.nombre);
        return "Saludos. " + componente1.nombre + " " + componente2.saluda();
    }
    @GetMapping("/adios/{nombre}")
    public String adios(@PathVariable String nombre){

        System.out.println("Nombre recibido: " + nombre);

        if (!nombre.equals("Jesus")) {
            String s = escribe(nombre);
            return s;
        }
        else
            return "Que tal profe";
    }
    private String escribe(String nombre){
        return "Nos vemos luego " + nombre;
    }
}
