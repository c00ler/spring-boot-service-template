package com.github.avenderov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.TraceRepositoryAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {TraceWebFilterAutoConfiguration.class, TraceRepositoryAutoConfiguration.class})
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

}
