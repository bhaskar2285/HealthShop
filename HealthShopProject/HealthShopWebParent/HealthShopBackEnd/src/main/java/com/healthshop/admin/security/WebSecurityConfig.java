package com.healthshop.admin.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	 @Bean
	 public UserDetailsService UserDetailsService() {
		 return new HealthShopUserDetailsService();
	 }
     @Bean
     public PasswordEncoder PasswordEncoder() {
    	 return new BCryptPasswordEncoder();
    	 
     }
     
     public DaoAuthenticationProvider authenticationProvider() {
    	   DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
    	   authProvider.setUserDetailsService(UserDetailsService());
    	   authProvider.setPasswordEncoder(PasswordEncoder());
    	   
    	   return authProvider;
     }
     
     
     @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
           auth.authenticationProvider(authenticationProvider());
	}
	public void configure(HttpSecurity http) throws Exception{
    	 http.authorizeRequests()
    	     .anyRequest().authenticated()
    	     .and()
    	     .formLogin()
    	     .usernameParameter("email")
    	     .loginPage("/login").permitAll()
 		    .and().logout().permitAll();
    	 
    	 
     }

	@Override
	public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/images/**","/js/**","/webjars/**");
        
	
	}
     
     
}
