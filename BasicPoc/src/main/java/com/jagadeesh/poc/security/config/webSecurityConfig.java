package com.jagadeesh.poc.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.jagadeesh.poc.security.CustomerServiceImpl;

@Configuration
public class webSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	CustomerServiceImpl customerService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	
		auth.userDetailsService(customerService);
			}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic();
		http.authorizeRequests().mvcMatchers(HttpMethod.GET, "/api/v1/products/").hasAnyRole("USER", "ADMIN")
				.mvcMatchers(HttpMethod.POST, "/api/v1/products/").hasRole("ADMIN").and().csrf().disable();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	

}
