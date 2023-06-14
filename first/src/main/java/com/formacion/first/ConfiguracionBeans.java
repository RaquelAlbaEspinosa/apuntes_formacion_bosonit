package com.formacion.first;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan
@Configuration
public class ConfiguracionBeans {
    public ConfiguracionBeans(){
        System.out.println("Iniciando configuracion Beans");
    }
    @Bean //Conexión que se usa para bases de datos y librerías que no están en nuestro código fuente
    Componente3 getComponente3(){
        return new Componente3();
    }
    @Bean
    @Qualifier("componente1Bean")
    Componente1 getComponente1(){
        var c = new Componente1();
        c.nombre = "NOMBRE DE BEAN";
        System.out.println(c.nombre);
        return c;
    }
}
