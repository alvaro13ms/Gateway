package com.example.gatewayserver;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Configuration
@Log4j2
public class FiltroGateway {

	@Bean
	@Order(-1)

	public GlobalFilter a() {
		return (exchange, chain) -> {
			log.info("primer pre filtro");
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info("tercer pre filtro");
			}));
		};
	}

	@Bean
	@Order(0)
	public GlobalFilter b() {
		return (exchange, chain) -> {
			log.info("segundo pre filtro");
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info("segundo pre filtro");
			}));
		};
	}

	@Bean
	@Order(1)
	public GlobalFilter c() {
		return (exchange, chain) -> {
			log.info("tercer pre filtro");
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info("tercer pre filtro");
			}));
		};
	}

}
