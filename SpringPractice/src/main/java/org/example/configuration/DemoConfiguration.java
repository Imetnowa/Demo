package org.example.configuration;

import org.example.Dog;
import org.example.Human;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class DemoConfiguration {
    @Bean
    static Dog createDog(){
        return new Dog(2, 1, "brown", "pink", "Amaya");
    }

    @Bean
    public String humanName(){
        return "Bryan";
    }
    @Bean
    public int  humanAge(){
        return 17;
    }
}
