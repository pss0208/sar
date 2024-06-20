package com.pss.sar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.pss.sar.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig{

    // @Bean
    // public UserDetailsService userDetailsService(){
    //     UserDetails user = User.builder()
    //         .username("user")
    //         .password("password")
    //         .roles("USER")
    //         .build();

    //     return new InMemoryUserDetailsManager(user);
    // }

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService)
            .passwordEncoder(new BCryptPasswordEncoder());
    }
}
