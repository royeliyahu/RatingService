package io.javabrains.RatingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RatingDataServiceApplication {

//	@Bean
//	public MockMvcBuilder getMockMvc(){
//		return new MockMvcBuilder() {
//			@Override
//			public MockMvc build() {
//				return null;
//			}
//		};
//	}
	public static void main(String[] args) {
		SpringApplication.run(RatingDataServiceApplication.class, args);
	}

}
