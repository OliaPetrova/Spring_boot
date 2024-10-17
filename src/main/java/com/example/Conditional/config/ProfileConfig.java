package com.example.Conditional.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Conditional.profile.DevProfile;
import com.example.Conditional.profile.ProductionProfile;
import com.example.Conditional.profile.SystemProfile;

@Configuration
public class ProfileConfig {
	
    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
