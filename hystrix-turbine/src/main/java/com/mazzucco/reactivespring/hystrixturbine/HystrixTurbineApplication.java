package com.mazzucco.reactivespring.hystrixturbine;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableTurbine
@EnableAutoConfiguration
public class HystrixTurbineApplication {

	public static void main( String[] args ) {
		final SpringApplication application = new SpringApplication(HystrixTurbineApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }
}
