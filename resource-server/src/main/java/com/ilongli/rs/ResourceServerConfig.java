package com.ilongli.rs;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author ilongli
 * @date 2023/2/3 11:01
 */
@EnableWebSecurity
public class ResourceServerConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests().anyRequest().authenticated()
//                .mvcMatcher("/user/**")
//                .authorizeRequests()
//                .mvcMatchers("/user/**")
//                .access("hasAuthority('USER')")
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }

}
