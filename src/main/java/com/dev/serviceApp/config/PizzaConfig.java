package com.dev.serviceApp.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="pizza")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PizzaConfig {
    private String sauce;
    private String topping;
    private String crust;

//    public PizzaConfig(String tomato, String mozzarella, String thin) {
//    }
//
//    public String getCrust() {
//        return crust;
//    }
//
//    public Object getTopping() {
//        return topping;
//    }
//
//    public Object getSauce() {
//        return sauce;
//    }
}
