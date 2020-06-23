package com.moicramsoft.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
		 builder
	        .inMemoryAuthentication()
	        .withUser("garrincha").password("123")
	            .roles("USER")
	        .and()
	        .withUser("zico").password("123")
	            .roles("USER");
	  }
}
