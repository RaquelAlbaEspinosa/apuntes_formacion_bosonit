package com.formacion.first;

import org.springframework.stereotype.Component;

@Component
public class Componente1 {
    public String nombre = "SIN NOMBRE";
    public Componente1(){
        System.out.println("Iniciando componente 1");
    }
    public String saludo(){
        return "hola desde componente 1 " + nombre;
    }
}
