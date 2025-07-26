package ru.netology.SpringBoot.configure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.netology.SpringBoot.profiler.impl.DevProfile;
import ru.netology.SpringBoot.profiler.impl.ProductionProfile;
import ru.netology.SpringBoot.profiler.SystemProfile;


@Configuration
public class JavaConfig {

    @ConditionalOnProperty(name ="netology.profile.dev", havingValue = "true")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }
    @ConditionalOnProperty(name ="netology.profile.dev", havingValue = "false", matchIfMissing = true)
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
