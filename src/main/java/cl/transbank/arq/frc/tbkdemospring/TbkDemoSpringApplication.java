package cl.transbank.arq.frc.tbkdemospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

@ComponentScan
@SpringBootApplication
public class TbkDemoSpringApplication extends SpringBootServletInitializer implements WebApplicationInitializer {
	public static void main(String[] args) {
		SpringApplication.run(TbkDemoSpringApplication.class, args);
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder  builder) {
        return builder.sources(TbkDemoSpringApplication.class);
    }
}
