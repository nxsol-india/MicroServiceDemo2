package com.commons.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EdgeApplication {

//	public static final String USER_SERVICE_URL = "http://user-service";
	
	public static void main(String[] args) {
		SpringApplication.run(EdgeApplication.class, args);
	}

	/*
	 * @Bean
	 * 
	 * @LoadBalanced public RestTemplate restTemplate() { return new RestTemplate();
	 * }
	 * 
	 * @Bean
	 * 
	 * @LoadBalanced public WebClient.Builder loadBalancedWebClientBuilder() {
	 * return WebClient.builder(); }
	 */
	
	/*
	 * @Bean public RouteLocator routeLocator(RouteLocatorBuilder builder) { return
	 * builder.routes() // COURSE_SERVICE_URL .route(r ->
	 * r.path("/course/**").uri(COURSE_SERVICE_URL)) // USER_SERVICE_URL .route(r ->
	 * r.path("/user/**").uri(USER_SERVICE_URL)) .route(r ->
	 * r.path("/country/**").uri(USER_SERVICE_URL)) .build(); }
	 */
}
