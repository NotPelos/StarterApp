package com.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.starter.models.Coche;
import com.starter.models.CocheBuilder;

@Configuration
@ConditionalOnClass({Coche.class,CocheBuilder.class, CocheService.class})
public class CocheCrudAutoConfigure {
	
	@Bean
	public CocheBuilder cBuilder() {
		return new CocheBuilder();
	}
	
	@Bean
	public CocheService pService() {
		return new CocheService();
	}

}
