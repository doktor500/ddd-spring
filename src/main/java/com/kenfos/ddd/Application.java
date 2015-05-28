package com.kenfos.ddd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@ComponentScan
@EnableAutoConfiguration
@EnableSpringConfigured
@EnableLoadTimeWeaving
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
