package kz.tickosh.gateway;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(GatewayServiceApplication.class)
				.web(WebApplicationType.REACTIVE)
				.run(args);
	}
}
