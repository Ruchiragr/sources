package com.test.boot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class ServiceStarter {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .showBanner(false)
                .sources(ServiceStarter.class)
                .run(args);
    }
}
