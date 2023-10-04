package com.valentyn.spring.my_test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.valentyn.spring.my_test")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

}
