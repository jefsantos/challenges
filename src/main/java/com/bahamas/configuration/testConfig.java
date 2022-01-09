package com.bahamas.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.bahamas.services.DbService;

@Configuration
@Profile("test")
public class testConfig {
	
	@Autowired
	private DbService dBServices;
	
	@Bean
	public boolean instance() {
		this.dBServices.instanceDataBase();
		
		return true;
	}
	

}
