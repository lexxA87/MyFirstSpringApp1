package org.tutorial;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.tutorial")
@PropertySource("classpath:musicPlayer.properties")
public class AppConficSpring {
}
