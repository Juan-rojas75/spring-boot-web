package com.hqsocial.springboot.web.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
			@PropertySource("classpath:mensajes.properties")
		})
public class MensajesPropertiesConfig {

}
